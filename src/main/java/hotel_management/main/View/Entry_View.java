package hotel_management.main.View;
import java.sql.*;
import java.util.*;
import hotel_management.main.Controller.*;

public class Entry_View {
	Customer_Details_Controller customerdetailscontroller = new Customer_Details_Controller();
	Order_Entry_Controller orderentrycontroller = new Order_Entry_Controller();
	Scanner scanner = new Scanner(System.in);
	public void bookingEntry() throws SQLException
	{
		Booking_Entry_Controller bookentrycontroller = new Booking_Entry_Controller();
		customerdetailscontroller.displayCustomerDetails();
		System.out.println("\nEnter Customer Id: ");
		int customerid = scanner.nextInt();
		System.out.println("");
		bookentrycontroller.displayRoomDetails();
		System.out.println("\nEnter Room Id: ");
		int roomid = scanner.nextInt();
		bookentrycontroller.setRoomDetails(roomid, customerid);
		System.out.println("\nBooking Completed\n");
		Main_View mainview = new Main_View();
		mainview.displayOptions();
	}
	public void orderEntry() throws SQLException
	{
		customerdetailscontroller.displayCustomerDetails();
		System.out.println("\nEnter Customer Id: ");
		int customerid = scanner.nextInt();
		orderentrycontroller.displayItemDetails();
		System.out.println("\nEnter Item Id: ");
		int itemid = scanner.nextInt();
		System.out.println("\nEnter Quantity: ");
		int quantity = scanner.nextInt();
		orderentrycontroller.setOrderDetails(itemid, customerid, quantity);
		System.out.println("\nOrder Completed\n");
		Main_View mainview = new Main_View();
		mainview.displayOptions();		
	}

	}