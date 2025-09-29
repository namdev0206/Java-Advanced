//1.	public static native void sleep(long millisecond) throws InterruptedException{}

//2.	public static void sleep(long millisecond, int nanoseconds) throws InterruptedException{} 

package SleepMethod;

public class SleepMethod 
{	
	public static void main(String[] args)
	{
		for(int i = 1; i <= 5; i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println(i);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}