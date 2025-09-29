//We have to create Daemon Thread before Starting the Thread
//Web Cannot crate main thread as Daemon Thread
//Its life DEpeds on another Thread
//It Inherits the nature/properties from its parent thread


package DaemonThreadMethods;

public class DamonThread extends Thread
{

	@Override
	public void run()
	{
		System.out.println("Child Thread");
	}
	
	public static void main(String args[])
	{
		System.out.println("Main Method");
		
		DamonThread th = new DamonThread();
		th.setDaemon(true);
		th.start();
	}
}