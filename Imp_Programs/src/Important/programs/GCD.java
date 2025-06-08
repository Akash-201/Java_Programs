package Important.programs;

public class GCD 
{
	public static void findGCD(int n,int m)
	{
		int gcd=1;
		
		for(int i=1;i<=n && i<=m; i++)
		{
			if(n%i==0 && m%i==0)
			{
				gcd=i;
			}
		}
		System.out.println(gcd);
	}
	public static void main(String[] args)
	{
		int n=24;
		int m=16;
		findGCD(n, m);
	}

}
