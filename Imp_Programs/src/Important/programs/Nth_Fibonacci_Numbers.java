package Important.programs;

import java.util.Scanner;

public class Nth_Fibonacci_Numbers 
{
	public static void print(int n)
	{
		int count=0;
		int a=0;
		int b=1;
		for(int i=0;i<=n;i++)
		{
			
			int c=a+b;
			a=b;
			b=c;
			count++;
			
			if(n==count)
			{
				System.out.println(a);
			     break;
			}
			
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
