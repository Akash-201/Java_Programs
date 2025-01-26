package Star_pattern;

//*********
// *******
//  *****
//   ***
//    *

import java.util.Scanner;

public class Star_Pattern10 
{
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=n-1;l>=i;l--)
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
