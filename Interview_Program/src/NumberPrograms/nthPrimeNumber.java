package NumberPrograms;
// WAP to print the nth prime number after a given number m
// example: given prime number m=3 and n=5 . the program should print the 5th prime number after 3 
// given input
// 3
// 5

// expected output : 17

public class nthPrimeNumber
{
	public static boolean checkPrime(int n)
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
			return true;
		}
		return false;
	}
	
	public static void nthPrime(int s, int num)
	{
		int c=0;
		for(int i=s+1;;i++)
		{
			if(checkPrime(i))
			{
				c++;
			}
			if(c==num)
			{
				System.out.println(i);
				break;
			}
		}
	}
	public static void main(String[] args) 
	{
		nthPrime(3,5);
		
	}

}
