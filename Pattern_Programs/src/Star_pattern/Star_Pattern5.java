package Star_pattern;

//      *
//    * *
//  * * *
//* * * *

import java.util.Scanner;

public class Star_Pattern5 
{
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				
				System.out.print("*");
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
