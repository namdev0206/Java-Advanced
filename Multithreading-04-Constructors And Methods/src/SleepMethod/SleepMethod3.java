//1.	public static native void sleep(long millisecond) throws InterruptedException{}

//2.	public static void sleep(long millisecond, int nanoseconds) throws InterruptedException{} 


package SleepMethod;

public class SleepMethod3 extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 5; i++)
			{
				System.out.println(i + " : " + Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	
	public static void main(String[] args) 
	{
		SleepMethod3 obj1 = new SleepMethod3();
		obj1.start();
		
		SleepMethod3 obj2 = new SleepMethod3();
		obj2.start();
	}
}