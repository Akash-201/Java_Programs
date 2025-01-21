package Important.programs;

import java.util.Scanner;

public class Fibonacci_In_A_Range
{
	public static void print(int n)
	{
		int a=1;
		int b=1;
		for(int i=1;a<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			print(n);
		}

	}

}
