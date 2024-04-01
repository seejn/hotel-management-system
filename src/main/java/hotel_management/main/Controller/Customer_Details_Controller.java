package hotel_management.main.Controller;

import java.sql.SQLException;
import java.util.List;

import hotel_management.main.Model.Customer_Details;
import hotel_management.main.repository.Customer_Details_Repository;

public class Customer_Details_Controller {

	Customer_Details_Repository customerdetailsrepository = new Customer_Details_Repository();
	public void displayCustomerDetails() throws SQLException
	{
		List<Customer_Details> customerdetails= customerdetailsrepository.getCustomerDetails();
		for(Customer_Details customerdetail:customerdetails)
		{
			
			System.out.println("");
			System.out.println(customerdetail.toString());
		}
	}
}
