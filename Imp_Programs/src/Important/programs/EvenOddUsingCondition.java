package Important.programs;

import java.util.Scanner;

public class EvenOddUsingCondition
{
	public static void print(int n)
	{
//		System.out.println(n+" is a "+((((n/2)*2)==n) ? "even" : "odd"));
		System.out.println(n+" is a "+(((n & 1)==0) ? "even" : "odd")+" number");
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
