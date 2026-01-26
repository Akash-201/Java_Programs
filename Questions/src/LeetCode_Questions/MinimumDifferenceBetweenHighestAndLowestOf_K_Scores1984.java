package LeetCode_Questions;

import java.util.Arrays;

// Leetcode:- 1984. Minimum Difference Between Highest and Lowest of K Scores

public class MinimumDifferenceBetweenHighestAndLowestOf_K_Scores1984 
{
	public static int minimumDifference(int[] nums, int k) 
	{
		int n=nums.length;
		Arrays.sort(nums);

		int minDiff=Integer.MAX_VALUE;
		int i=0;
		int j=i+k-1;
		while(j<n)
		{
			int minElement=nums[i];
			int maxElement=nums[j];
			minDiff=Math.min(minDiff,maxElement-minElement);
			i++;
			j++;
		}
		return minDiff;
	}
	public static void main(String[] args) 
	{
		int[] nums= {90};
		System.out.println(minimumDifference(nums,1));  // 0

		int[] nums2= {9,4,1,7};
		System.out.println(minimumDifference(nums2,2));  // 2
	}

}
