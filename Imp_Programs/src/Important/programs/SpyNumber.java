package Important.programs;

import java.util.Scanner;

public class SpyNumber 
{
	public static void check(int n)
	{
		int temp=n;
		int sum=0;
		int product=1;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			product*=rem;
			n/=10;
		}
		if(sum==product)
		{
			System.out.println(temp+" is a spy number");
		}
		else {
			System.out.println(temp+" is not a spy number");
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
