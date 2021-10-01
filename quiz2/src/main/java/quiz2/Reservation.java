package quiz2;

public class Reservation {
	
	private String name;
	private int room_no;

	public Reservation(String n) {
		name =n;
		// TODO Auto-generated constructor stub
	}
	
	public Reservation(String n,int rno)
	{
		name=n;
		room_no=rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoom_no() {
		return room_no;
	}

	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}

	
}
