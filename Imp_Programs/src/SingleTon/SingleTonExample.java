package SingleTon;
class Samosa
{
	private static Samosa samosa;
	
	private Samosa()
	{
		
	}
	
	// lazy way to creating singleton object 
	public static Samosa getSamosa()
	{
		if(samosa==null)
		{
			samosa=new Samosa();
		}
		return samosa;
	}
}

public class SingleTonExample
{
	public static void main(String[] args) 
	{
		Samosa samosa1=Samosa.getSamosa();
		System.out.println(samosa1.hashCode());
		
		Samosa samosa2=Samosa.getSamosa();
		System.out.println(samosa2.hashCode());
		
		
	}

}
