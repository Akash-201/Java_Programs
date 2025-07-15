package CompanyQuestions;

public class MaximumSubarraySum
{
	public static int findSubarray(int[] arr, int k)
	{
		int maxSum=0;
		
		for(int i=0;i<=arr.length-k;i++)
		{
			int currentSum=0;
			for(int j=i;j<i+k;j++)
			{
				 currentSum=arr[i]+arr[j];
			}
			if(maxSum<currentSum)
			{
				maxSum=currentSum;
			}
		}
		return maxSum;
	}
	public static void main(String[] args)
	{
		int[] arr= {100,200,300,400};
		int k=2;
		System.out.println(findSubarray(arr, k));
	}

}
