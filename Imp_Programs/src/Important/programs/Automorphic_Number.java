package Important.programs;

import java.util.Scanner;

public class Automorphic_Number 
{
	public static boolean check(int n)
	{
		int square=n*n;
		while(n>0)
		{
			if(n%10!=square%10)
			{
				return false;
			}
			n=n/10;
			square=square/10;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(check(n));
		}
		
	}

}
