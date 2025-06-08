package Important.programs;

public class GCD3 
{
	public static int findGCD(int x,int y)
	{
		while(x%y!=0)
		{
			int rem=x%y;
			x=y;
			y=rem;
		}
		
		return y;
	}
	public static void main(String[] args)
	{
		System.out.println(findGCD(12,18));
	}

}
