package Interrupt;

public class InterruptMethod extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 5; i++)
			{
				System.out.println(i);
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
		InterruptMethod obj1 = new InterruptMethod();
		obj1.start();
		obj1.interrupt();
	}
}