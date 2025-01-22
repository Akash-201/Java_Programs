package Important.programs;

import java.util.Scanner;

public class Merge_2_Number 
{
	public static void merge(int a,int b)
	{
		// convert int to string
		
		String concateString=Integer.toString(a)+Integer.toString(b);
		
//		System.out.println(concateString);  // but this is print in string formate
		
		
		// convert string to int
		int concateInt=Integer.parseInt(concateString);
		System.out.println(concateInt);
		
		
		// for single digit 
//		System.out.println((a*10)+b);
		
		
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a=sc.nextInt();
		System.out.print("Enter second number: ");
		int b=sc.nextInt();
		
		merge(a,b);
		}
		
	}

}
