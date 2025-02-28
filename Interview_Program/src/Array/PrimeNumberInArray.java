package Array;

public class PrimeNumberInArray 
{
	// method to check prime number
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
		if(count==2)
		{
			return true;
		}
		return false;
	}
	
	// method to print prime number elements in a array
	public static void printPrime(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(checkPrime(arr[i]))
			{
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,5,8,9,13,16,19,3};
		printPrime(arr);
	}
	
}
