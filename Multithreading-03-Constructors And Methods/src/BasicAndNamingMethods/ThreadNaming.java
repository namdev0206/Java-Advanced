package BasicAndNamingMethods;

public class ThreadNaming extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("Nihil Thread - 1");
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("Thread Task");
	}
	
	
	//Main thread is provided and run by JVM internally
	public static void main(String[] args)
	{
//		System.out.println(Thread.currentThread().getName());
//		Thread.currentThread().setName("deepak");
//		System.out.println(Thread.currentThread().getName());
		
		ThreadNaming tn = new ThreadNaming();
		//Naming of this thread will be Thread-0 by Default
		tn.start();
		
		
		System.out.println(tn.isAlive());
	}
}