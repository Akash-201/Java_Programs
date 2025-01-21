package Important.programs;

import java.util.Scanner;

public class Even_Digit_In_A_Number 
{
	public static void print(int n)
	{
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				System.out.print(rem+" ");
			}
			n/=10;
		}
		System.out.println();
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
