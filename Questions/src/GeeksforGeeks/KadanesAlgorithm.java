package GeeksforGeeks;

public class KadanesAlgorithm 
{
	static long maxSubarraySum(int arr[])
	{
		long max=arr[0];
		long sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
			if(sum>max)
			{
				max=sum;
			}
			if(sum<0)
			{
				sum=0;
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int[] arr= {2, 3, -8, 7, -1, 2, 3};
		System.out.println(maxSubarraySum(arr));  // 11

		int[] arr2= {-2,-4};
		System.out.println(maxSubarraySum(arr2)); // -2

		int[] arr3= {5, 4, 1, 7, 8};
		System.out.println(maxSubarraySum(arr3));  // 25
	}

}
