package CompanyQuestions;

/* You are given an array of positive integers arr and a target integer target.
Find the start and end indexes (0-based) of a continuous subarray that adds up exactly to target.
If no such subarray exists, return [-1, -1].
*/

import java.util.Arrays;

public class IndexesOfSubArraySum 
{
	public static int[] subArraySumPositive(int [] arr, int target)
	{
		int left=0;
		int sum=0;
		for(int right=0;right<arr.length;right++)
		{
			sum+=arr[right];
			while(sum>target && left<=right)
			{
				sum-=arr[left++];
			}
			if(sum==target)
			{
				return new int[]{left,right};
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		int[] arr= {1, 4, 20, 3, 10, 5};
		int target=33;
		System.out.println(Arrays.toString(subArraySumPositive(arr, target)));
	}

}
