package BookTheaterApp;


public class BookTheaterSeat 
{
	int totalSeats = 10;
	
	void bookSeat(int seats)
	{
		if(totalSeats >= seats)
		{
			System.out.println(seats + "Seats Booked Sucessfully");
			
			totalSeats = totalSeats - seats;
			
			System.out.println("Seats Left = " + totalSeats);
		}
		else
		{
			System.out.println("Seats can not be Booked");
			
			System.out.println("Seats Left = " + totalSeats);
		}
	}
}