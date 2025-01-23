package Numbers_Pattern;

//5 4 3 2 1
//5 4 3 2
//5 4 3 
//5 4 
//5

import java.util.Scanner;

public class Number_Program5 
{
	public static void print(int n)
	{
	
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of n: ");	
			int n=sc.nextInt();
			print(n);
		}

	}

}
