package Important.programs;

//0 1 1 2 4 7 13 24 44 81 149 274 504 927 1705

import java.util.Scanner;

public class Tribonacci_Series 
{
	public static void print(int n)
	{
		int a=0;
		int b=1;
		int c=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int d=a+b+c;
			a=b;
			b=c;
			c=d;
			
		}
		
	}
	
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of n: ");	
			int n=sc.nextInt();
			print(n);
		}

	}

}
