package Important.programs;

import java.util.Scanner;

// using third variable

public class Swap_Two_Number 
{
	public static void swapTwonumber(int a,int b)
	{
	   int temp=a;
	   a=b;
	   b=temp;
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
		swapTwonumber(a, b);
		
	}

}
