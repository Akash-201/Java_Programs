package Important.programs;

import java.util.Scanner;

public class CountDigit 
{
	public static void count(int n)
	{
		int c=0;
		while(n>0)
		{
			int rem=n%10;
			c++;
			n=n/10;
		}
		System.out.println(c);
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		count(n);
		}
		
	}

}
