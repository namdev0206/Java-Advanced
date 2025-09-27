// 1. Extends the Thread Class
public class Multithread01 extends Thread
{
	// 2. Override the run method
	public void run()
	{
		//thread task
	}
	
	public static void main(String[] args) 
	{
		// 3. Create an Object of the Class
		Multithread01 t = new Multithread01();
		
		// 4. Start the Object
		t.start();
	}
}