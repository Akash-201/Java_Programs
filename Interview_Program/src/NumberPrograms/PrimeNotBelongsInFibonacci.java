package NumberPrograms;
// WAP that checks if a given number is prime but does not belongs to the fibonacci series. The program should return 1 if 
// the number is prime and does not belongs to the series or 0 otherwise

public class PrimeNotBelongsInFibonacci 
{
	public static int checkPrime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int isFibonacci(int key)
	{
		int a=0;
		int b=1;
		while(a<=key)
		{
			int c=a+b;
			if(a==key)
			return 1;
			a=b;
			b=c;
		}
		return 0;
	}
	
	public static int checkPrimeNotFibonacci(int num)
	{
		if(checkPrime(num)==1 && isFibonacci(num)==0)
		{
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args)
	{
		System.out.println(checkPrimeNotFibonacci(21));
	}

}
