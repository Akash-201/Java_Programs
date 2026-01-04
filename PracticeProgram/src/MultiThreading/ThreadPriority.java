package MultiThreading;

public class ThreadPriority extends Thread
{
	public void run()
	{
		System.out.println("Child Thread");
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args)
	{
		System.out.println("Main Thread Old Priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Main Thread New Priority: "+Thread.currentThread().getPriority());
		ThreadPriority tp=new ThreadPriority();
		tp.setPriority(8);
		tp.start();
	}
}

