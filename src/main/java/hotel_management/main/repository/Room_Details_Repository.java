package hotel_management.main.repository;

import java.sql.*;
import java.util.*;

import hotel_management.main.DBConnection;
import hotel_management.main.Model.*;

public class Room_Details_Repository {
	public List<Room_Details> getRoomDetails() throws SQLException
	{
		Connection connection = DBConnection.getConn();
		Statement statement = connection.createStatement();
    	ResultSet rs = statement.executeQuery("SELECT * FROM rooms;");
    	List<Room_Details> room_details = new ArrayList<>();
    	while(rs.next())
		{
    		Room_Details room_detail = new Room_Details(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getString(5));
    		room_details.add(room_detail);
		}
    	
    	return room_details;
	}
	public void setRoomDetails(int roomid, int customerid) throws SQLException
	{
		Connection connection = DBConnection.getConn();
		Statement statement = connection.createStatement();
		statement.executeUpdate("INSERT INTO booking(ROOM_ID, CUSTOMER_ID) VALUES("+roomid+","+customerid+")");
	}
}
