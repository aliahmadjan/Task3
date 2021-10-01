package quiz2;


public class Room {
	
	private int room_id;
	private int room_no;
	private int bed_number;
	int [] room;

	public Room(int rid,int rno,int bedno) {
		
		room_id=rid;
		room_no=rno;
		bed_number=bedno;
		// TODO Auto-generated constructor stub
	}
	
	public Room(int rno)
	{
		room_no=rno;
	}
	public int getRoomId()
	{
		return room_id;
	}
	
	public int getRoomNo()
	{
		return room_no;
	}
	
	public int getBedNumber()
	{
		return bed_number;
	}

	public void setRoomId(int rid)
	{
		this.room_id=rid;
	}
	
	public void setRoomNo(int rno)
	{
		this.room_no=rno;
	}
	
	public void setBedNumber(int bno)
	{
		this.bed_number=bno;
	}
	
	
	
	
}
