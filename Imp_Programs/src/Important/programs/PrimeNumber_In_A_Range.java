package Important.programs;

import java.util.Scanner;

public class PrimeNumber_In_A_Range
{
	public static boolean check(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return true;
		}
		return false;
	}
	
	public static void print(int s,int e)
	{
		for(int i=s;i<=e;i++)
		{
			if(check(i))
			{
				System.out.print(i+", ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Number: ");
		int s=sc.nextInt();
		System.out.print("Enter Ending Number: ");
		int e=sc.nextInt();
		print(s,e);
		}
		
	}

}
