package hotel_management.main.Model;

public class Room_Details {
	int roomid;
	String type;
	double price;
	String description;
	String status;
	
	public Room_Details(int roomid, String type, double price, String description, String status)
	{
		this.roomid=roomid;
		this.type=type;
		this.price=price;
		this.description=description;
		this.status=status;
	}
	
	public String toString()
	{
		return "Room-Id: "+roomid+" \nType: "+type+"\nPrice: " + price +"\nDescription: " + description + "\nStatus: "+ status+"";
	}
}
