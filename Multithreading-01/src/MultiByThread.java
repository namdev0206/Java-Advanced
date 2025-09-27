// 1. Extends the thread class
public class MultiByThread extends Thread
{
	//2. Override the Run Method
	public void run()
	{
		//Task for the run() method
	}
	
	public static void main(String[] args) 
	{
		//3. Create Object of Class
		MultiByThread threadObj = new MultiByThread();
		
		
		//4. Invoke the Thread
		threadObj.start();
	}
}