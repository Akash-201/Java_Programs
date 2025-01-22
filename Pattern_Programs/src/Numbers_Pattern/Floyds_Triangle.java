package Numbers_Pattern;

//WAJP to print Floyd's triangle.
//•   Input: n = 5
//•   Output: 
//•   1 
//•   2 3 
//•   4 5 6 
//•   7 8 9 10 
//•   11 12 13 14 15 

import java.util.Scanner;

public class Floyds_Triangle
{
	public static void print(int n)
	{
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	
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
