package Important.programs;

import java.util.Scanner;

public class First_N_Even_Number
{
	public static void print(int n)
	{
		int c=0;
		for(int i=1;;i++)
		{
			if(i%2==0)
			{
				c++;
				System.out.print(i+" ");
				if(c==n)
				{
					break;
				}
			}
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
