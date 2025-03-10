package NumberPrograms;

import java.util.Scanner;

public class EvenOdd3 
{
	public static void checkEvenOdd(int n)
	{
		System.out.println((n & 1)==0 ? "even" : "odd");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter any Number: ");
			int n=sc.nextInt();
			checkEvenOdd(n);
		}
	}
}
