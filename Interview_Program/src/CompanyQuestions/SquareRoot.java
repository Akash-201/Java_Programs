package CompanyQuestions;

import java.util.Scanner;

public class SquareRoot 
{
	public static int findSquareRoot(int num)
	{
		int result=0;
		while(result*result<=num)
		{
			result++;
		}
		return result-1;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			System.out.println(findSquareRoot(n));
		}
	}

}
