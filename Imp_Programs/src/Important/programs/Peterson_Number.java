package Important.programs;

import java.util.Scanner;

public class Peterson_Number 
{
	public static void check(int n)
	{
		int temp=n;
		int sum=0;
		while(n>0)
		{
			
			int rem=n%10;
			int multi=1;
			for(int i=rem;i>=1;i--)
			{
				multi=multi*i;
			}
			sum=sum+multi;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp +" is a Peterson Number");
		}
		else
		{
			System.out.println(temp +" is not a Peterson Number");
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
