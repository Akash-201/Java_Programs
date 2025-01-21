package Important.programs;

import java.util.Scanner;

//WAJP to print a given series.
//•	Input: n = 10
//•	Output: 1 2 4 8 16 32

public class Series_Question3
{
	public static void print(int n)
	{
		int a=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			a=a*2;
		}
		System.out.println();
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
