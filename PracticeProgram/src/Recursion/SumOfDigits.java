package Recursion;

public class SumOfDigits
{
	public static int sumOfDigits(int n)
	{
		if(n>=0 && n<=9)
		{
			return n;
		}
		int lastDigit=n%10;
		int sum=0;
		sum=sum+sumOfDigits(n/10);
		
		return sum+lastDigit;
	}
	public static void main(String[] args)
	{
		int n=1;
		System.out.println(sumOfDigits(n));
		
	}

}
