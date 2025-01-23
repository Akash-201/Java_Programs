package Numbers_Pattern;

//1
//2 1
//3 2 1
//4 3 2 1

import java.util.Scanner;

public class Number_Program3
{
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
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

