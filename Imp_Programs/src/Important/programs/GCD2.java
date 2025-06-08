package Important.programs;

public class GCD2 
{
	public static int findGCD(int n,int m)
	{
		int min=Math.min(n, m);
		
		for(int i=min;i>=1;i--)
		{
			if(n%i==0 && m%i==0)
			{
				return i;
			}
		}
		return 1;
	}
	
	public static void main(String[] args)
	{
		System.out.println(findGCD(12,18));
	}

}
