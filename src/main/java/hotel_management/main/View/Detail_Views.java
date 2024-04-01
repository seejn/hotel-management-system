package hotel_management.main.View;

import java.sql.*;

import hotel_management.main.Controller.*;

public class Detail_Views {

	public void displayBookingDetails() throws SQLException
	{
		Booking_Details_Controller bookingdetailscontroller = new Booking_Details_Controller();
		System.out.println("Booking-Details\n");
		bookingdetailscontroller.displayBookingDetails();
		Main_View mainview = new Main_View();
		mainview.displayOptions();
	}
	public void displayOrderDetails() throws SQLException
	{
		Order_Details_Controller orderdetailscontroller = new Order_Details_Controller();
		System.out.println("Order-Details\n");
		orderdetailscontroller.displayOrderDetails();
		Main_View mainview = new Main_View();
		mainview.displayOptions();
	}
}
