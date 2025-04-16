package CompanyQuestions;

// given a non-negative integer num, return the square root of num , rounded down to the nearest integer. the returned
// integer should be non negative as well

// input: num=4
// output: 2

//input: num=8
//output: 2

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
		
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			System.out.println(findSquareRoot(n));
		
	}

}
