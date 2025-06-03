package Recursion;

import java.util.Scanner;

public class PrintN_to_1number
{
	public static void printNumber(int n)
	{
		if(n==1)
		{
			// base case
			System.out.println(1);
			return;
		}
		
		// self work
		System.out.println(n);
		
		// recursive work
		printNumber(n-1);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int n=sc.nextInt();
		printNumber(n);
	}

}
