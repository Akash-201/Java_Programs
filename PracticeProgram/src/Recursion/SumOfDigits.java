package Recursion;

public class SumOfDigits
{
	public static int sumOfDigits(int n)
	{
		// Base Case
		if(n>=0 && n<=9)
		{
			return n;
		}
		
		// 1st way
		
//		int lastDigit=n%10;
//		int sum=0;
//		sum=sum+sumOfDigits(n/10);
//		return sum+lastDigit;
		
		
		// 2nd way
		return (n%10)+sumOfDigits(n/10);
	}
	public static void main(String[] args)
	{
		int n=12345;
		System.out.println(sumOfDigits(n));
		
	}

}
