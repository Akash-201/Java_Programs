package Important.programs;

import java.util.Scanner;

public class Smith_Number 
{
	public static void check(int n)
	{
		int temp=n;
		int temp1=temp;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		int sum1=0;
		for(int i=2;i<=temp;i++)
		{
			if(temp%i==0)
			{
				int rem1=i%10;
				sum1=sum1+rem1;
				temp=temp/10;
			}
		}
		if(sum==sum1)
		{
			System.out.println(temp1+" is a Smith Number");
		}
		else
		{
			System.out.println(temp1+" is not a Smith Number");
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
