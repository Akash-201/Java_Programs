package MultiThreading;

public class YieldMethod extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"-"+i);
		}
	}
	public static void main(String[] args) {
		YieldMethod ym=new YieldMethod();
		ym.start();

		for(int i=1;i<=5;i++)
		{
			Thread.yield();
			System.out.println("Main Thread"+"-"+i);
		}
	}

}
