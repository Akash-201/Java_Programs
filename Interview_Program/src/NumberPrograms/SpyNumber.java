package NumberPrograms;

//A "spy number" is a positive integer where the sum of its digits equals the product of its digits.

import java.util.Scanner;


public class SpyNumber 
{
	public static void checkSpyNumber(int n)
	{
		int temp=n;
		int sum=0;
		int multi=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			multi=multi*rem;
			n=n/10;

		}
		if(sum==multi)
		{
			System.out.println(temp+" is a spy number" );
		}
		else
		{
			System.out.println(temp+" is not a spy number");
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=sc.nextInt();
		checkSpyNumber(n);
	}

}
