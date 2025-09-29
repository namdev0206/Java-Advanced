//	If a Thread wants to wait for another thread
//	to complete its task, then we should use join() method

//	public final void join() throws InterruptedException{-};

//	public final synchronized void join(long millisecond){-}

//	public final synchronized void join(long millisecond, int nanoseconds){-}



package JoinMethod;

public class JoinMethod extends Thread
{
	public void run()
	{
		try
		{
			for(int i = 1; i <= 5; i++)
			{
				System.out.println("Child Thread : " + i);
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
		JoinMethod obj1 = new JoinMethod();
		obj1.start();
		
		try
		{
			obj1.join();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		
		try
		{
			for(int i = 1; i <= 5; i++)
			{
				System.out.println("Main Thread : " + i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}