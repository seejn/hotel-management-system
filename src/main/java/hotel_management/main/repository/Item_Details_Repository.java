package hotel_management.main.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hotel_management.main.DBConnection;
import hotel_management.main.Model.*;

public class Item_Details_Repository {

	public List<Item_Details> getItemDetails() throws SQLException
	{
		Connection connection = DBConnection.getConn();
		Statement statement = connection.createStatement();
    	ResultSet rs = statement.executeQuery("SELECT * FROM items;");
    	List<Item_Details> item_details = new ArrayList<>();
    	while(rs.next())
		{
    		Item_Details item_detail = new Item_Details(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getString(6));
    		item_details.add(item_detail);
		}
    	
    	return item_details;
	}
	public void setOrderDetails(int itemid, int customerid, int quantity, double cost ) throws SQLException
	{
		Connection connection = DBConnection.getConn();
		Statement statement = connection.createStatement();
		statement.executeUpdate("INSERT INTO orders(ITEM_ID, CUSTOMER_ID, QUANTITY, COST) VALUES("+itemid+","+customerid+","+quantity+","+cost+");");
	}
}
