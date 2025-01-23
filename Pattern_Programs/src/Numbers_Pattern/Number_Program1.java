package Numbers_Pattern;

//1
//1 2
//1 2 3
//1 2 3 4

import java.util.Scanner;

public class Number_Program1 
{
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
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
