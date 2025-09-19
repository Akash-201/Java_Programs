package HackerRank;

import java.math.BigInteger;

public class ExtraLongFactorials
{
	public static void extraLongFactorials(int n) 
	{
		BigInteger sum=BigInteger.ONE;
		for(int i=2;i<=n;i++)
		{
			sum=sum.multiply(BigInteger.valueOf(i));
		}
		System.out.println(sum);

	}
	public static void main(String[] args) 
	{
		int n=25;
		extraLongFactorials(n);
	}

}
