package Array;
//Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.

//Examples:

//Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
//Output: 11
//Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

//Input: arr[] = {-2, -4}
//Output: –2
//Explanation: The subarray {-2} has the largest sum -2.

//Input: arr[] = {5, 4, 1, 7, 8}
//Output: 25
//Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.

public class MaximumSubarraySum 
{
	public static void maximumSubarraySum(int[] arr)
	{

		int finalSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			int initialSum=0;
			for(int j=i;j<arr.length;j++)
			{
				initialSum+=arr[j];
				if(initialSum > finalSum)
				{
					finalSum=initialSum;
				}
			}

		}
		System.out.println(finalSum);

	}
	public static void main(String[] args)
	{
		int[] arr= {2, 3, -8, 7, -1, 2, 3};
		maximumSubarraySum(arr);
	}


}
