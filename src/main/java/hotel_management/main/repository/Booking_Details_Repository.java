package hotel_management.main.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hotel_management.main.DBConnection;
import hotel_management.main.Model.*;
public class Booking_Details_Repository {
	public List<Booking_Details> getBookingLists() throws SQLException
	{
		Connection connection = DBConnection.getConn();
		Statement statement = connection.createStatement();
    	ResultSet rs = statement.executeQuery("SELECT * FROM booking_details;");
    	List<Booking_Details> booking_details = new ArrayList<>();
    	while(rs.next())
		{
    		Booking_Details booking_detail = new Booking_Details(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7));
    		booking_details.add(booking_detail);
		}
    	
    	return booking_details;
	}
}
