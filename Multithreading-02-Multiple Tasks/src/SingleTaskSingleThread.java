public class SingleTaskSingleThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread Task");
	}
	
	
	public static void main(String[] args) 
	{
		SingleTaskSingleThread obj = new SingleTaskSingleThread();
		
		obj.start();
	}

}
