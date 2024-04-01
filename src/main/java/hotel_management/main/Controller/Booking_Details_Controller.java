package hotel_management.main.Controller;

import java.sql.SQLException;
import java.util.List;

import hotel_management.main.Model.Booking_Details;
import hotel_management.main.repository.Booking_Details_Repository;


public class Booking_Details_Controller {
	Booking_Details_Repository bookingdetailrepository = new Booking_Details_Repository();
	public void displayBookingDetails() throws SQLException
	{
		List<Booking_Details> bookingdetails= bookingdetailrepository.getBookingLists();
		for(Booking_Details bokingdetail:bookingdetails)
		{
			
			System.out.println("");
			System.out.println(bokingdetail.toString());
		}
	}
}
