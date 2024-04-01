package hotel_management.main.repository;

import java.sql.*;
import java.util.*;

import hotel_management.main.DBConnection;
import hotel_management.main.Model.*;

public class Customer_Details_Repository {
	public List<Customer_Details> getCustomerDetails() throws SQLException
	{
		Connection connection = DBConnection.getConn();
		Statement statement = connection.createStatement();
    	ResultSet rs = statement.executeQuery("SELECT * FROM customer;");
    	List<Customer_Details> customer_details = new ArrayList<>();
    	while(rs.next())
		{
    		Customer_Details customer_detail = new Customer_Details(rs.getInt(1), rs.getString(2));
    		customer_details.add(customer_detail);
		}
    	
    	return customer_details;
	}
}
