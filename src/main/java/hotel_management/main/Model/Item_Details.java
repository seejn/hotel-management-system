package hotel_management.main.Model;

public class Item_Details {

	int itemid;
	String type;
	String itemname;
	double cost;
	String details;
	String status;
	
	public Item_Details(int itemid, String type, String itemname, double cost, String details, String status)
	{
		this.itemid = itemid;
		this.type = type;
		this.itemname = itemname;
		this.cost = cost;
		this.details = details;
		this.status = status;
	}
	
	public String toString()
	{
		return "Item-Id: "+itemid+" \nType: "+type+"\nItem-Name: "+itemname+"\n Cost: "+cost+"\nDetails: "+details+"\nStatus: "+status+"";
	}
	public int getItemId()
	{
		return itemid;
	}
	public double getCost()
	{
		return cost;
	}
}
