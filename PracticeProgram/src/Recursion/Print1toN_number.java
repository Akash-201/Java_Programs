package Recursion;

import java.util.Scanner;

public class Print1toN_number
{
	public static void printNumber(int n)
	{
		if(n==1)
		{
			System.out.println(n);
			return;
		}

		printNumber(n-1);
		System.out.println(n);

	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter any number: ");
			int n=sc.nextInt();
			printNumber(n);
		}
	}

}
