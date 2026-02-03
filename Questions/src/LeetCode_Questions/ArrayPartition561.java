package LeetCode_Questions;

// Leetcode:- 561. Array Partition

import java.util.Arrays;

public class ArrayPartition561 
{
	public static int arrayPairSum(int[] nums) 
	{
		Arrays.sort(nums);
		int ans = 0;
		for(int i = 0;i<nums.length;i += 2)
		{
			ans += nums[i];
		}
		return ans;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,4,3,2};
		System.out.println(arrayPairSum(arr));  // 4

		int[] arr2= {6,2,6,5,1,2};
		System.out.println(arrayPairSum(arr2)); // 9
	}

}
