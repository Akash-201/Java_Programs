package Recursion;

public class NthFibonacciNumber 
{
	public static int fibonacciNumber(int n)
	{
		// base case
		if(n==0 )
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}

		// recursive work
		int prev=fibonacciNumber(n-1);
		int prevPrev=fibonacciNumber(n-2);

		// self work
		return prev+prevPrev;

	}
	public static void main(String[] args)
	{
		int n=7;
		System.out.println(fibonacciNumber(n));
	}

}
