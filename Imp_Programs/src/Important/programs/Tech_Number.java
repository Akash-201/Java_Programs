package Important.programs;

//WAJP to check ,given  four-digit number is a  Tech number or not..
//•	Example: 2025 => 20 + 25 => 45^2 = 2025

import java.util.Scanner;

public class Tech_Number 
{
	public static void check(int n)
	{
		int temp=n;
		while(n>=1000 && n<=9999)
		{
			int rem=n%100;
			int result=n/100;
			int sum=rem+result;
			int square=sum*sum;
			if(square==temp)
			{
				System.out.println(n+" is a tech number");
			}
			else
			{
				System.out.println(n+" is not a tech number");
			}
			break;
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
