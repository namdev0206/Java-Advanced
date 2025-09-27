
public class SingleTaskMultipleThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread Task");
	}
	
	public static void main(String[] args) 
	{
		SingleTaskMultipleThread obj = new SingleTaskMultipleThread();
		obj.start();
		
		SingleTaskMultipleThread obj2 = new SingleTaskMultipleThread();
		obj2.start();
	}
}
