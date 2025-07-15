package CompanyQuestions;

/* Given an integer array arr and an integer k, find the maximum sum of any contiguous subarray of size k.

Example:

Input: arr = [100, 200, 300, 400], k = 2  
Output: 700

Explanation: Subarrays of size 2 → [100,200], [200,300], [300,400]  
Maximum sum = 300 + 400 = 700
*/

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
				currentSum+=arr[j];
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
		int[] arr1 = {2, 1, 5, 1, 3, 2};
		int k1 = 3;
		System.out.println(findSubarray(arr1, k1));
	}

}
