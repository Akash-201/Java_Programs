package MultiThreading;

// Methods of Thread class | Thread Naming (getName() setName()) | currentThread() & isAlive()

public class ThreadMethod extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		ThreadMethod th=new ThreadMethod();
		th.start();
		System.out.println("Hello");
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Akash");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
	}

}
