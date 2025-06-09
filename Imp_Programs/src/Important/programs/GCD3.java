package Important.programs;

import java.util.Scanner;

//Efficient Iterative GCD (Euclidean Algorithm)

public class GCD3 
{
	public static int findGCD(int x,int y)
	{
		while(x%y!=0)
		{
			int rem=x%y;
			x=y;
			y=rem;
		}
		
		return y;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First number: ");
		int x=sc.nextInt();
		System.out.print("Enter second number: ");
		int y=sc.nextInt();
		
		System.out.println(findGCD(x,y));
	}

}
