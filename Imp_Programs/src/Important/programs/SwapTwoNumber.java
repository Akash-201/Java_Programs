package Important.programs;

import java.util.Scanner;

//without using third variable

public class SwapTwoNumber 
{
	public static void swapTwoNumber(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("After swapping a is: "+a);
		System.out.println("After swapping b is: "+b);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		swapTwoNumber(a, b);

	}

}
