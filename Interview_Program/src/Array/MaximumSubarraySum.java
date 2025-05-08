package Array;
//Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
//Output: 11
//Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.

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
		int[] arr= {5, 4, 1, 7, 8};
		maximumSubarraySum(arr);
	}


}
