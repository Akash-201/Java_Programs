package NumberPrograms;

import java.util.Scanner;

public class EvenOdd1
{
	public static void checkEvenOdd(int n)
	{
		if(n%2==0)
		{
			System.out.println(n+" is a even number");
		}
		else {
			System.out.println(n+" is a odd number");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.print("Enter any number: ");
		int n=sc.nextInt();
		checkEvenOdd(n);
		}
	}

}
