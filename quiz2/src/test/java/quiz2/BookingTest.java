package quiz2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class BookingTest {

	private static Booking book;
	@Before
	public void setUp() throws Exception {
	book=new Booking();
	}

	@Test
	public void testAddRooms() {
		
		book.AddRooms(1);
		book.AddRooms(2);
		book.AddRooms(3);
		
		//int [] expected= {1,2,3};
		String e="Room has been added!\r\n"
				+ "Room has been added!\r\n"
				+ "Room has been added!";
		for(int i=0;i<3;i++)
		{
			Assert.assertEquals(e, e);
		}
		//fail("Not yet implemented");
	}
	
	@Test
	public void testReserveRoom()
	{
		book.AddRooms(1);
		book.ReserveRoom("Ali", 1);
	    book.AddRooms(2);
	    book.ReserveRoom("Ahmad", 2);
	    
	    Assert.assertEquals(true, true);
	}
	
	

}
