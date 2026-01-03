package MultiThreading;

public class ByRunnableInterface implements Runnable
{
	public void run()
	{
		System.out.println("Runnable Interface");
	}

	public static void main(String[] args) 
	{
		ByRunnableInterface t=new ByRunnableInterface();
		Thread th=new Thread(t);
		th.start();  // Runnable Interface
	//	th.start();  // IllegalThreadStateException

	}

}
