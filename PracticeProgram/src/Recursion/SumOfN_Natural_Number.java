package Recursion;

public class SumOfN_Natural_Number 
{
	public static int sumOfNumber(int n)
	{
		// base case
		
		if(n==0)
		{
			return n;
		}
		
		// recursive work
		int sum=sumOfNumber(n-1);
		
		// self work
		return n+sum;
	}
	public static void main(String[] args)
	{
		System.out.println(sumOfNumber(10));
	}

}
