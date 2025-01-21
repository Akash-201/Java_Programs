package Important.programs;

//WAJP to print a given series.
//•	Input: n = 6
//•	Output: 1 3 6 10 15 21

import java.util.Scanner;

public class Series_Question2 
{
	public static void print(int n)
	{
		int a=1;
		int b=3;
		int d=2;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			a=a+d;
			d++;
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
