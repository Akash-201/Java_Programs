package Important.programs;

public class LuckyNumber
{
	public static void checkLuckyNumber(int n)
	{
		int temp=n;
		int sumOfDigit=0;
		int squareOfDigit=0;
		while(n>0)
		{
			int rem=n%10;
			sumOfDigit+=rem;
			squareOfDigit+=rem*rem;
			n=n/10;

		}
		if(checkPrime(sumOfDigit) && checkPrime(squareOfDigit))
		{
			System.out.println(temp+" is a Lucky Number");
		}
		else
		{
			System.out.println(temp+" is not a lucky Number");
		}
	}


	public static boolean checkPrime(int n) 
	{
		if(n<=1) return false;

		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;

	}
	public static void main(String[] args) {
		checkLuckyNumber(24);
	}

}
