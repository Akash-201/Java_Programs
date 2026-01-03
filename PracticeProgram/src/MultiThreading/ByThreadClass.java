package MultiThreading;

public class ByThreadClass extends Thread
{
	public void run()
	{
		System.out.println("Thread Class");
	}
	public static void main(String[] args) 
	{
		ByThreadClass t=new ByThreadClass();
		t.start(); // Thread Class
	//	t.start();  // java.lang.IllegalThreadStateException
	}

}
