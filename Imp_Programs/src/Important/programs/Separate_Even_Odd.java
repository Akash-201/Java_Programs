package Important.programs;

import java.util.Scanner;

public class Separate_Even_Odd 
{
	public static void print(int n)
	{
		int even=0;
		int odd=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				even=(even*10)+rem;
			}
			else
			{
				odd=(odd*10)+rem;
			}
			n=n/10;
		}
		System.out.println("Even Digit are:- "+even);
		System.out.println("Odd Digit are:- "+odd);
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
