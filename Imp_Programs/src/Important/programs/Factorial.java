package Important.programs;

import java.util.Scanner;

public class Factorial 
{
	public static void print(int n)
	{
		int multi=1;
		for(int i=n;i>=1;i--)
		{
			multi*=i;
			
		}
		System.out.println(multi);
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
