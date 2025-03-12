package NumberPrograms;

import java.util.Scanner;

public class NthFibonacciNumber 
{
	public static void nthFibonacciNumber(int n)
	{
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++)
		{
			if(i==n)
			{
				System.out.println(a);
			}
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter number: ");
			int n=sc.nextInt();
			if (n < 1) 
			{
				System.out.println("Please enter a positive integer.");
			} else 
			{
				nthFibonacciNumber(n);
			}
		}

	}
}
