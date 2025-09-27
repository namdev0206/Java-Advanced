
//1. Implements the Runnable INterface
public class MultiByRunnable implements Runnable
{
	//2. Override the Run Method
	@Override
	public void run() 
	{
		//Thread Task
		
	}
	
	public static void main(String[] args) 
	{
		//3. Create an Object of Class
		MultiByRunnable classObj = new MultiByRunnable();
		
		//4. Create an Object of THREAD class
		//And pass the parameter in Constructor
		Thread threadObj = new Thread(classObj);
		
		//5. Invoke the Thread
		threadObj.start();
	}
}