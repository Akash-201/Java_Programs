package Important.programs;

import java.util.Scanner;

public class Nth_Prime_number 
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
	
	public static void print(int m)
	{
		int count1=0;
		for(int i=1;;i++)
		{
			if(check(i))
			{
				count1++;
			}
			if(count1==m)
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
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		print(n);
		}
		
	}

}
