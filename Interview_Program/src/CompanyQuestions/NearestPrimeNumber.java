package CompanyQuestions;

/*   
   Given a number N. The task is to print the nearest prime 
if the number is not prime by making it prime by adding prime numbers sequentially from 2. 

Examples: 
	Input: N = 8 
	Output: 13 
	8 is not prime, so add the first prime to it to get 10 
	10 is not prime, hence add the second prime, i.e., 3 to get 13 which is prime. 
	Input: N = 45 
	Output: 47
 */

public class NearestPrimeNumber
{
	public static boolean checkPrime(int n)
	{
		if(n<=1) return false;

		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static int makePrime(int n)
	{
		int sum=n;
		for(int i=2;i<n*n;i++)
		{
			if(checkPrime(i))
			{
				sum+=i;

				if(checkPrime(sum))
					return sum;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		System.out.println(makePrime(8));  // 13
		System.out.println(makePrime(45));  // 47

	}

}
