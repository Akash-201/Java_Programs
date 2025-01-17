package Important.programs;

import java.util.Scanner;

public class Reverse_A_Number 
{
	public static void print(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println(rev);
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
