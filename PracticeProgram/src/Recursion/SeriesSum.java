package Recursion;

//Given a number n, find the sum of natural numbers till n but with alternate signs
// that means:-  1-2+3-4+5-6+7-8.......


//input:- n=10
//output:- -5

//input:-  n=5
//output:- 3

public class SeriesSum
{
	static int seriesSum(int n)
	{
		// Base case
		if(n==0)
		{
			return 0;
		}
		if(n%2==0)
		{
			return seriesSum(n-1)-n;
		}
		else
		{
			return seriesSum(n-1)+n;
		}
	}
	public static void main(String[] args)
	{
		System.out.println(seriesSum(10));
	}
	

}
