package SingleTon;

class SingleTonClasssExample
{
	static SingleTonClasssExample instance;
	
	
	private SingleTonClasssExample()
	{
		System.out.println("Singleton object is created...");
	}
	
	public static SingleTonClasssExample getInstance()
	{
		if(instance==null)
		{
			instance= new SingleTonClasssExample();
		}
		return instance;
	}
}


public class SingleTonExample
{
	public static void main(String[] args)
	{
		SingleTonClasssExample s1=SingleTonClasssExample.getInstance();
		System.out.println(s1.hashCode());
		
		SingleTonClasssExample s2=SingleTonClasssExample.getInstance();
		System.out.println(s2.hashCode());
		
		System.out.println(s1==s2);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
	}

}
