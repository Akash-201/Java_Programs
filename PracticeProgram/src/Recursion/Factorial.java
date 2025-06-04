package Recursion;

public class Factorial
{
	public static int factorial(int n)
	{
		// base case
		if(n==0)
			return 1;

		// smaller problem  // recursive problem
		int smallerAnswer=factorial(n-1);

		// self work
		return n*smallerAnswer;




	}
	public static void main(String[] args)
	{
		int n=5;
		System.out.println(factorial(n));
	}

}
