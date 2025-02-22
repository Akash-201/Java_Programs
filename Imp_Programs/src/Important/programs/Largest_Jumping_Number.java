package Important.programs;

//A number N called a jumping number if all the adjacent digits in N have an absolute difference of 1. 
//Note that the difference between 9 and 0 is not considered as 1. 
//Therefore, all single-digit number is considered as a jumping number.

import java.util.Scanner;

public class Largest_Jumping_Number
{
	public static void print(int n)
	{
		int num=n;
		boolean temp=true;
		while(n>0)
		{
			int digit1=n%10;
			n=n/10;
			if(n!=0)
			{
				int digit2=n%10;
				if(Math.abs(digit1-digit2)!=1)
				{
					temp=false;
					break;
				}
			}
			
		}
		if(temp)
		{
			System.out.println(num +" is a jumping number");
		}
		else {
			System.out.println(num +" is not a jumping number");
		}
		
	}
	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			print(n);
		}
		
	}

}
