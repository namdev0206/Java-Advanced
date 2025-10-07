package StaticSynchronization;

public class MovieBookApp extends Thread
{
	static BookTheaterSeat b;
	int seats;
	
	public void run()
	{
		b.bookSeat(seats);
	}
	
	public static void main(String args[])
	{
		BookTheaterSeat b1 = new BookTheaterSeat();
		MyThread1 t1 = new MyThread1(b1, 7);
		t1.start();
		MyThread2 t2 = new MyThread2(b1, 6);
		t2.start();
		
		
		BookTheaterSeat b2 = new BookTheaterSeat();
		MyThread1 t3 = new MyThread1(b2, 8);
		t1.start();
		MyThread2 t4 = new MyThread2(b2, 9);
		t2.start();
	}
}