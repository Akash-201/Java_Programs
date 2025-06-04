package Recursion;

import java.util.Scanner;

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
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter any number: ");
			int n=sc.nextInt();
			System.out.println(factorial(n));
		}
	}

}
