package Important.programs;

import java.util.Scanner;

public class n_Perfect_Number
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
		{
			return false;
		}
	}
	
	public static void print(int m)
	{
		int count=0;
		for(int i=1;;i++)
		{
			if(check(i))
			{
				System.out.print(i+" ");
				count++;
			}
			if(count==m)
			{
				break;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int m=sc.nextInt();
			print(m);
		}

	}

}
