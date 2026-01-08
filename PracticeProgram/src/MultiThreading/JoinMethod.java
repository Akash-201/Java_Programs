package MultiThreading;

public class JoinMethod extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i+"-"+Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws Exception
	{
		JoinMethod jm=new JoinMethod();
		JoinMethod jm2=new JoinMethod();

		jm.start();
		jm.join();
		jm2.start();
	}
}

