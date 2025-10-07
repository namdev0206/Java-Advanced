package Interrupt;

public class IsInterruptedMethod extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().isInterrupted());
		
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
		IsInterruptedMethod obj1 = new IsInterruptedMethod();
		obj1.start();
		obj1.interrupt();
	}
}