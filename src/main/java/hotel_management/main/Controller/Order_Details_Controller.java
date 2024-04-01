package hotel_management.main.Controller;

import java.sql.*;
import java.util.*;

import hotel_management.main.Model.*;
import hotel_management.main.repository.*;

public class Order_Details_Controller {
	Order_Details_Repository orderdetailrepository = new Order_Details_Repository();
	public void displayOrderDetails() throws SQLException
	{
		List<Order_Details> orderdetails= orderdetailrepository.getOrderDetails();
		for(Order_Details orderdetail:orderdetails)
		{
			
			System.out.println("");
			System.out.println(orderdetail.toString());
		}
	}
}
