//1.	public static native void sleep(long millisecond) throws InterruptedException{}

//2.	public static void sleep(long millisecond, int nanoseconds) throws InterruptedException{} 


package SleepMethod;

public class SleepMethod2 extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		SleepMethod2 obj1 = new SleepMethod2();
		
		obj1.start();
	}
}