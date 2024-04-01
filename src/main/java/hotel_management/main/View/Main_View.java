package hotel_management.main.View;
import java.sql.*;
import java.util.*;

public class Main_View {
	Scanner scanner = new Scanner(System.in);
	Detail_Views detailview = new Detail_Views();
	Entry_View entryview = new Entry_View();
	public void displayOptions() throws SQLException
	{
		System.out.println("Options: ");
		System.out.println("1) Display Booking-Details ");
		System.out.println("2) Display Order-Details ");
		System.out.println("3) Booking Entry ");
		System.out.println("4) Food Order Entry ");
		System.out.println("Enter Choice:  ");
		
		int choice = scanner.nextInt();
		switch(choice)
		{
		case 1: 
			detailview.displayBookingDetails();
			break;
		case 2: 
			detailview.displayOrderDetails();
			break;
		case 3: 
			entryview.bookingEntry();
			break;
		case 4: 
			entryview.orderEntry();
			break;
		default:
			System.out.println("Not a valid option.\n");
			displayOptions();
		}
	}
}
