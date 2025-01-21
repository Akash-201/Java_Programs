package Important.programs;

import java.util.Scanner;

//WAJP to print a given series.
//•	Input: n = 10
//•	Output: 1 4 9 16 25 36 49 64 81 100

public class Series_Question1 
{
	public static void print(int n)
	{
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(i*i+" ");
		}
		
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
