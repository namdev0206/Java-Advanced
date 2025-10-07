package StaticSynchronization;


public class BookTheaterSeat 
{
	int totalSeats = 20;
	
	synchronized void bookSeat(int seats)
	{
		System.out.println("Hello "+ Thread.currentThread().getName());
		System.out.println("Hello "+ Thread.currentThread().getName());
		System.out.println("Hello "+ Thread.currentThread().getName());
		System.out.println("Hello "+ Thread.currentThread().getName());
		System.out.println("Hello "+ Thread.currentThread().getName());
		
		synchronized(this)
		{
			if(totalSeats >= seats)
			{
				System.out.println(seats + " : Seats Booked Sucessfully");
				
				totalSeats = totalSeats - seats;
				
				System.out.println("Seats Left = " + totalSeats);
			}
			else
			{
				System.out.println("Seats can not be Booked");
				
				System.out.println("Seats Left = " + totalSeats);
			}
		}
		
		System.out.println("Hello "+ Thread.currentThread().getName());
		System.out.println("Hello "+ Thread.currentThread().getName());
		System.out.println("Hello "+ Thread.currentThread().getName());
		System.out.println("Hello "+ Thread.currentThread().getName());
		System.out.println("Hello "+ Thread.currentThread().getName());
	}
}