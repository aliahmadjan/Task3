package quiz2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    private Customer guest;
    ArrayList<Room> room;
    
    private int rnum=1;
    Reservation robj;
    private ArrayList<Reservation> reserve;
    private boolean booked = false;
	
	private int booking_no;
	private String CheckinDate;
	private String CheckoutDate;
	private String guest_name;
	private int booking_id;
	private  String booking_type;
	
	public Booking()
	{
		guest= new Customer();
		room= new ArrayList();
		booking_id=-1;
		booking_type="Reserved";
	}
	public Booking(int bno,String checkin,String checkout,String gname,int bid,String btype) {
		
		booking_no=bno;
		CheckinDate=checkin;
		CheckoutDate=checkout;
		guest_name=gname;
		booking_id=bid;
		booking_type=btype;
		// TODO Auto-generated constructor stub
	}
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public String getBooking_type() {
		return booking_type;
	}
	public void setBooking_type(String booking_type) {
		this.booking_type = booking_type;
	}

	  public boolean AddRooms(int room_no)
	  {
		  room.add(new Room(room_no));
		  System.out.println("Room has been added!");
	  return true;
	  }


  public boolean ReserveRoom(String name,int rno)
  {
	  try {
		  if(AddRooms(rno))
		  //if(room.get(rnum-1)==null)
		  {
			  
			 robj=new Reservation(name,rno);
			 reserve.set(rno-1, robj);
			 rnum++;
			 System.out.println("Room has been reserved!");
			 return true;
		  }
		  
	  }
	  catch(Exception vb)
	  {
		  System.out.println("Room has not been reserved!");
		  return false;
	  }
	  return true;
  }
 // public boolean BookRoom()
  //{
	  
	//	System.out.println("Room has been booked!");
		//  return booked;
	  
	  
		//  return booked=true;
  //}
	 public static void BookRoom(Room[] r,int rno)
	  {
		 // String room_no;
		  Scanner input=new Scanner(System.in);
		   System.out.println("Enter Room No");
		   rno=input.nextInt()-1;
	  r[rno].setRoomNo(rno);
		  System.out.println("Room has been booked");
	     	  //return booking_no;
	 }
	  
	  public static void AvailableRooms()
	  
	  {
		  Room [] r = null;
		  for(int i=0;i<r.length;i++)
		  {
			  if(r[i].getRoomNo()==0)
			  {
				  System.out.println("Room "+i+1+"is available");
			  }
		  }
	  }
	  
	  public static void SearchAGuest(Customer[]c)
	  {
		 // int room_no;
		  
		  String name;
		  int search=-1;
		  Scanner input=new Scanner(System.in);
		//  System.out.println("Enter name of guest to be searched");
		 // name=input.nextLine();
		  for(int i=0;i<c.length;i++)
		  {
			  if(c[i].getCustomerName()=="Ali")
			  {
				  System.out.println("Guest has been found!");
				  search=i;
				  break;
			  }
			  else
			  {
				  System.out.println("No Guest has been found!");
			  }
		  }
	  }
	  
	 
}
