package Recursion;

import java.util.Scanner;

public class FibonacciNumber 
{
	public static int fibonacciNumber(int n)
	{
		// base case
		if(n==0 || n==1)
		{
			return n;
		}

		// recursive work
		int prev=fibonacciNumber(n-1);
		int prevPrev=fibonacciNumber(n-2);

		// self work
		return prev+prevPrev;

	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter any number: ");
			int n=sc.nextInt();

			for(int i=0;i<=n;i++)
			{
				System.out.print(fibonacciNumber(i)+" ");
			}
			System.out.println();
		}
	}

}
