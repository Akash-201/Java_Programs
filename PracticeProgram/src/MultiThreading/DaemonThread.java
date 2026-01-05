package MultiThreading;

public class DaemonThread extends Thread
{
	public void run()
	{
		System.out.println("Deamon Thread");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Thread");
		DaemonThread dt=new DaemonThread();
		dt.setDaemon(true);
		dt.start();	
	}
}

