package Important.programs;

public class LuckyNumbers_In_Range 
{
	public static void luckyNumbers(long a, long b) 
	{
		int count=0;
		for(long i=a;i<=b;i++)
		{
			long temp=i;
			int digitSum=0;
			int squareSum=0;

			while(temp>0)
			{
				int rem=(int)(temp%10);
				digitSum+=rem;
				int square=rem*rem;
				squareSum+=square;
				temp/=10;
			}
			if(checkPrime(digitSum) && checkPrime(squareSum))
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public static boolean checkPrime(long n)
	{
		if(n<=1) return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}

		return true;
	}
	public static void main(String[] args)
	{
		luckyNumbers(20,25);  // 21 23 25 
		luckyNumbers(1,20);  //  11 12 14 16

	}

}
