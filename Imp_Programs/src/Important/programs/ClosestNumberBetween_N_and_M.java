//Given two integers N and M, WAJP to find the number closest to N and divisible by M. If there is more than one such number, output the one with the maximum absolute value.
//•	Input: N = 13, M = 4
//•	Output: 12


package Important.programs;

import java.util.Scanner;

public class ClosestNumberBetween_N_and_M 
{
	public static void print(int n,int m)
	{
		for(int i=n;i>=m;i--)
		{
			if(i%m==0)
			{
				System.out.println(i);
				break;
			}
			
		}
	}
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of N: ");
			int n=sc.nextInt();
			System.out.println("Enter the value of M: ");
			int m=sc.nextInt();
			print(n,m);
		}
		
	}

}
