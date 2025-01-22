package Important.programs;

import java.util.Scanner;

public class Remove_Zero_in_a_Number 
{
	public static void remove(int n)
	{
		int m=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem!=0)
			{
				m=(m*10)+rem;
			}
			n=n/10;
		}
		
		while(m>0)
		{
			int rem1=m%10;
			System.out.print(rem1);
			m=m/10;
					
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
		
		remove(n);
		}
		
	}
	
}
