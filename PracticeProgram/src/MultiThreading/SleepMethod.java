package MultiThreading;

public class SleepMethod extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=5;i++)
			{
				System.out.println(i+" : "+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{

		SleepMethod sm=new SleepMethod();
		sm.start();
		
		SleepMethod sm2=new SleepMethod();
		sm2.start();
	}

}
