package hotel_management.main.Controller;

import java.sql.*;
import java.util.List;

import hotel_management.main.Model.*;
import hotel_management.main.repository.*;

public class Booking_Entry_Controller {

	Room_Details_Repository roomdetailsrepository = new Room_Details_Repository();
	public void displayRoomDetails() throws SQLException
 	{
		List<Room_Details> roomdetails= roomdetailsrepository.getRoomDetails();
		for(Room_Details roomdetail:roomdetails)
		{
			
			System.out.println("");
			System.out.println(roomdetail.toString());
		}
	}
	public void setRoomDetails(int roomid,int customerid) throws SQLException
	{
		Room_Details_Repository roomdetailsrepository = new Room_Details_Repository();
		roomdetailsrepository.setRoomDetails(roomid, customerid);
	}
}
