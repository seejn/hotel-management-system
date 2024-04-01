package hotel_management.main.Controller;

import java.sql.SQLException;
import java.util.List;

import hotel_management.main.Model.*;
import hotel_management.main.repository.*;

public class Order_Entry_Controller {


	Order_Details_Repository orderdetailsrepository = new Order_Details_Repository();
	Item_Details_Repository itemdetailrepository = new Item_Details_Repository();
	public void displayItemDetails() throws SQLException
 	{
		List<Item_Details> itemdetails= itemdetailrepository.getItemDetails();
		for(Item_Details itemdetail:itemdetails)
		{
			
			System.out.println("");
			System.out.println(itemdetail.toString());
		}
	}
	public void setOrderDetails(int itemid,int customerid, int quantity) throws SQLException
	{
		List<Item_Details> itemdetails= itemdetailrepository.getItemDetails();
		for(Item_Details itemdetail:itemdetails)
		{
			if(itemdetail.getItemId() == itemid)
			{
				double cost = itemdetail.getCost() * quantity;
				itemdetailrepository.setOrderDetails(itemid, customerid, quantity, cost);
				System.out.println("Total Cost: " + cost);
			}
		}
	}
}
