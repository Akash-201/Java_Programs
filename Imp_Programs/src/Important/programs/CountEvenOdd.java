package Important.programs;

import java.util.Scanner;

public class CountEvenOdd 
{
	public static void count(int n)
	{
		int even=0;
		int odd=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0 && rem!=0)
			{
			  even++;	
			}
			else if(rem!=0)
			{
				odd++;
			}
			n/=10;
		}
		System.out.println("Total Even Digit Are: "+even);
		System.out.println("Total Odd Digit Are: "+odd);
		
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
