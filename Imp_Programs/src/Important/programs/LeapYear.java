package Important.programs;

import java.util.Scanner;

public class LeapYear 
{
	public static void check(int n)
	{
		if(n%400==0 || (n%4==0 && n%100!=0))
		{
			System.out.println(n +" is a leap year");
		}
		else {
			System.out.println(n+" is not a leap year");
		}
		
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		check(n);
		}
		
	}


}
