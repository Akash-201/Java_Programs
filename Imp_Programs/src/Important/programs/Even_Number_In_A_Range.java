package Important.programs;

import java.util.Scanner;

public class Even_Number_In_A_Range 
{
	public static boolean check(int n)
	{
		if(n%2==0)
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
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Starting Number: ");
		int s=sc.nextInt();
		System.out.println("Enter Ending Number: ");
		int e=sc.nextInt();
		print(s,e);
		}
		
	}

}
