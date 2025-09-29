//	Stops the current Executing thread
//	and give the chance to other threads for execution 

//	Output may be Different

package YieldMethod;

public class YieldMethod extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName() + "-" + i);
		}
	}
	
	public static void main(String[] args) 
	{
		YieldMethod obj1 = new YieldMethod();
		
		obj1.start();
		
		Thread.yield();
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName() + "-" + i);
		}
	}
}