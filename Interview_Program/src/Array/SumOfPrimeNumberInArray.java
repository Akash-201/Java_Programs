package Array;

public class SumOfPrimeNumberInArray 
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
		
		// method to sum of prime number elements in a array
		public static void sumOfPrime(int[] arr)
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				if(checkPrime(arr[i]))
				{
					sum=sum+arr[i];
				}
			}
			System.out.println("Sum of prime number elements in a given array is: "+sum);
		}
		
		public static void main(String[] args) {
			int[] arr= {1,5,8,9,13,16,19,3};
			sumOfPrime(arr);
		}

}
