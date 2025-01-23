package Star_pattern;

//* * * * * 
//* * * * 
//* * * 
//* * 
//* 

import java.util.Scanner;

public class Star_Pattern3 
{
	public static void print(int n)
	{
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
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
