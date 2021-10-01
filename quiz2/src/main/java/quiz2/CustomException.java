package quiz2;

public class CustomException extends Exception{

	private static Booking book;
	public CustomException() {
		book=new Booking();
		// TODO Auto-generated constructor stub
	}

	public static void AddRoomsException() throws CustomException
	{
		book.AddRooms(-1);
		System.out.println("Negative rooms cant be added!");
	}
}
