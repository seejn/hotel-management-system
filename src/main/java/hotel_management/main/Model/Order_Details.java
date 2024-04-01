package hotel_management.main.Model;

public class Order_Details {
	int orderid;
	String name;
	String itemtype;
	String itemname;
	String status;
	String date;
	double itemcost;
	int quantity;
	double totalcost;
	
	public Order_Details(int orderid,String name,String itemtype,String itemname,String status,String date,double itemcost,int quantity,double totalcost)
	{
		this.orderid=orderid;
		this.name=name;
		this.itemtype=itemtype;
		this.itemname=itemname;
		this.status=status;
		this.date=date;
		this.itemcost=itemcost;
		this.quantity=quantity;
		this.totalcost=totalcost;
	}
	public String toString()
	{
		return "ORDER-ID: "+orderid+"\nCUSTOMER-NAME: "+name+"\nITEM-TYPE: "+itemtype+"\nITEM-NAME: "+itemname+"\nSTATUS: "+status+"\nDATE: "+date+"\nITEM-COST: "+itemcost+"\nQUANTITY: "+quantity+"\nTOTAL-COST: "+totalcost+"\n";
	}
}
