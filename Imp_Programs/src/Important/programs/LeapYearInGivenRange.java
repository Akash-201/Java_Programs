package Important.programs;

import java.util.Scanner;

public class LeapYearInGivenRange 
{
	public static boolean check(int n)
	{
		if(n%400==0 || (n%4==0 && n%100!=0))
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
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting year... ");
		int s=sc.nextInt();
		System.out.println("Enter ending year... ");
		int e=sc.nextInt();
		print(s,e);
		}
		
	}

}
