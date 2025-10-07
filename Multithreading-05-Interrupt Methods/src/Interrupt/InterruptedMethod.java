package Interrupt;

public class InterruptedMethod extends Thread
{
	public void run()
	{
		System.out.println(Thread.interrupted());
		
		try
		{
			for(int i = 1; i <=5; i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
				
				System.out.println(Thread.interrupted());
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) 
	{
		InterruptedMethod obj1 = new InterruptedMethod();
		obj1.start();
		obj1.interrupt();
	}
}