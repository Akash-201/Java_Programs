package Important.programs;

import java.util.Scanner;

public class Sum_Product_Of_A_Digit
{
	
	public static void print(int n)
	{
		int sum=0;
		int multi=1;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			multi*=rem;
			n/=10;
		}
		System.out.println("sum is "+sum);
		System.out.println("product is "+multi);
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
