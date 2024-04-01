package hotel_management.main.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hotel_management.main.DBConnection;
import hotel_management.main.Model.Booking_Details;
import hotel_management.main.Model.Order_Details;

public class Order_Details_Repository {
	public List<Order_Details> getOrderDetails() throws SQLException
	{
		Connection connection = DBConnection.getConn();
		Statement statement = connection.createStatement();
    	ResultSet rs = statement.executeQuery("SELECT * FROM order_details;");
    	List<Order_Details> order_details = new ArrayList<>();
    	while(rs.next())
		{
    		Order_Details order_detail = new Order_Details(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getFloat(7), rs.getInt(8), rs.getFloat(9));
    		order_details.add(order_detail);
		}
    	
    	return order_details;
	}
}
