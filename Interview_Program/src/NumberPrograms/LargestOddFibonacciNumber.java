package NumberPrograms;

// program to print the Largest Odd Fibonacci Number in a given range.
// if the number doesn't fall in the given range then print 0. 


import java.util.Scanner;

public class LargestOddFibonacciNumber
{
	public static int findLargestOddFibonacciNumber(int s, int e)
	{
		int a=0;
		int b=1;
		int largestOdd=0;
		for(int i=1;i<=e;i++)
		{
			if(a>=s && a<=e)
			{
				if(a%2!=0)
				{
				largestOdd= a;	
				}
			}
			int c=a+b;
			a=b;
			b=c;
		}
		return largestOdd;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter Starting Number: ");
			int s=sc.nextInt();
			System.out.print("Enter Ending Number: ");
			int e=sc.nextInt();
			System.out.println(findLargestOddFibonacciNumber(s,e));
		}
		
		
	}
	

}
