package hotel_management.main.Model;

public class Booking_Details {
	int bookingid;
	String name;
	int contact;
	String bookingdate;
	String roomtype;
	double price;
	String status;
	
	public Booking_Details(int bookingid, String name, int contact, String bookingdate,	String roomtype, double price, String status)
	{
		this.bookingid=bookingid;
		this.name=name;
		this.contact=contact;
		this.bookingdate=bookingdate;
		this.roomtype=roomtype;
		this.price=price;
		this.status=status;
	}
	public String toString()
	{
		return "BOOKING_ID: "+bookingid+"\nCUSTOMER_NAME: "+name+"\nCONTACT: "+contact+"\nBOOKING_DATE: "+bookingdate+"\nROOMTYPE: "+roomtype+"\nPRICE: "+price+"\n";
	}
}
