
public class MultipleTaskMultipleThread extends Thread
{
	public static void main(String[] args) 
	{
		Thread1 obj1 = new Thread1();
		obj1.start();
		
		Thread2 obj2 = new Thread2();
		obj2.start();
	}
}


class Thread1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Class 1 Task 1");
	}
}


class Thread2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Class 2 Task 2");
	}
}