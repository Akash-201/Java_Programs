package Important.programs;

// A number is an ugly number if ALL of its prime factors are ONLY 2, 3, and/or 5
// (No other prime factor is allowed)

public class UglyNumbers
{
	public static boolean isUglyNumber(int n)
	{
		if(n<=0)
			return false;

		while(n%2==0)
			n=n/2;

		while(n%3==0)
			n=n/3;

		while(n%5==0)
			n=n/5;

		return n==1;
	}
	public static void main(String[] args) 
	{
		System.out.println(isUglyNumber(8));  // true
		System.out.println(isUglyNumber(7));  // false
		System.out.println(isUglyNumber(4));  // true
	}

}
