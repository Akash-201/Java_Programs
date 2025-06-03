package Recursion;

public class PrintN_to_1number
{
	public static void printNumber(int n)
	{
		if(n==1)
		{
			// base case
			System.out.println(1);
			return;
		}
		
		// self work
		System.out.println(n);
		
		// recursive work
		printNumber(n-1);
	}
	public static void main(String[] args)
	{
		int n=10;
		printNumber(n);
	}

}
