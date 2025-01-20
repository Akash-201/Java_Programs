package Important.programs;

import java.util.Scanner;

public class Fibonacci_Numbers
{
	public static void print(int n)
	{
		int a=1;
		int b=1;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		
	}
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		print(n);
		}
		
	}
}
