package Important.programs;

import java.util.Scanner;

public class Prime_Number 
{
	public static void check(int n)
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
			System.out.println(n+" is a Prime Number");
		}
		else
		{
			System.out.println(n+" is not a Prime Number");
		}
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		check(n);
		}
		
	}

}
