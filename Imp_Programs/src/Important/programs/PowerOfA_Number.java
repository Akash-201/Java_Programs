package Important.programs;

import java.util.Scanner;

public class PowerOfA_Number
{
	public static void print(int n,int m)
	{
		int multi=1;
		for(int i=1;i<=m;i++)
		{
			multi=multi*n;
			
		}
		System.out.println(multi);
		
	}
	
	public static void main(String[] args) 
	{
		while(true)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number for base: ");
		int n=sc.nextInt();
		System.out.print("Enter a number for power: ");
		int m=sc.nextInt();
		
		print(n,m);
		}
		
	}


}
