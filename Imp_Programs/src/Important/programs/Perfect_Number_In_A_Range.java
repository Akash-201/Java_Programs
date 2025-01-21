package Important.programs;

import java.util.Scanner;

public class Perfect_Number_In_A_Range
{
	public static boolean check(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			return true;
		}
		else
			return false;
	}
	
	public static void print(int s,int e)
	{
		for(int i=s;i<=e;i++)
		{
			if(check(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter starting number: ");
			int s=sc.nextInt();
			System.out.println("Enter ending number: ");
			int e=sc.nextInt();
			print(s,e);
		}

	}
}
