//By Default Main Thread Priority is 5
//Priorities Depends on the Platform
//Windows does not support priorities

package ThreadPrioritiesMethods;

public class ThreadPriorities extends Thread
{
	public void run()
	{
		System.out.println("Child Thread");
		
		System.out.println("Run Thread : " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Thread : " + Thread.currentThread().getPriority());
		
		
		ThreadPriorities obj1 = new ThreadPriorities();
		
		obj1.setPriority(10);
		
		obj1.start();
	}
}