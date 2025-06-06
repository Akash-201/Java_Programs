package Recursion;

//Given a number n  and a value k, print k multiples of num

//input:- number n=3, value k=5
//output:- 3,6,9,12,15

public class MultiplyNumber 
{
	public static void multiplyNumber(int n,int k)
	{
		//		Base case
		if(k==1)
		{
			System.out.println(n);
			return;
		}

		// recursive work
		multiplyNumber(n, k-1);

		// self work
		System.out.println(n*k);


	}
	public static void main(String[] args)
	{
		int n=3;
		int k=5;
		multiplyNumber(n, k);
	}
}
