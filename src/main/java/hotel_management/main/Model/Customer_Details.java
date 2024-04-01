package hotel_management.main.Model;

public class Customer_Details {
	int customerid;
	String customername;
	
	public Customer_Details(int customerid, String customername)
	{
		this.customerid = customerid;
		this.customername = customername;
	}
	
	public String toString()
	{
		return "Customer-Id: "+customerid+" \nCustomer-Name: "+customername+"";
	}
	public int getCustomerId()
	{
		return customerid;
	}
	public String getCustomerName()
	{
		return customername;
	}
}