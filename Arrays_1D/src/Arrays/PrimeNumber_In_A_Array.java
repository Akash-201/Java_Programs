package Arrays;

public class PrimeNumber_In_A_Array
{
	public static boolean checkPrime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		return count==2;
	}
	
	public static void primeInArray(int[] arr)
	{
		int c=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(checkPrime(arr[i]))
			{
				System.out.print(arr[i]+" ");
				c++;
			}
		}
		System.out.println("\nTotal Prime Number are:- "+c);
	}

	public static void main(String[] args) 
	{
		int[] arr= {8,9,11,13,14,15,17};
		primeInArray(arr);
		 
	}
}
