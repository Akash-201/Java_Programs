package SingleTon;

class Jilebi
{
	// Eager way to creating singleton object
	private static Jilebi jilebi=new Jilebi();
	
	private Jilebi()
	{
		
	}
	
	public static Jilebi getjJilebi()
	{
		return jilebi;
	}
}

public class SingleTonExample2 
{
	public static void main(String[] args)
	{
		Jilebi jilebi1=Jilebi.getjJilebi();
		System.out.println(jilebi1.hashCode());
		
		Jilebi jilebi2=Jilebi.getjJilebi();
		System.out.println(jilebi2.hashCode());
		
		
		
	}

}
