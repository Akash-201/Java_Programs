package Important.programs;

import java.util.Scanner;

public class Check_Given_Number_Is_Fibonacci_or_Not 
{
	public static boolean check(int n)
	{
		int a=1;
		int b=1;
		for(int i=1;i<=n;i++)
		{
			
			
			int c=a+b;
			a=b;
			b=c;
			if(a==n)
			{
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			System.out.println(check(n)); 
		}

	}

}
