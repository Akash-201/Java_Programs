package LeetCode_Questions;

// Leetcode:- 3379. Transformed Array

import java.util.Arrays;

public class TransformedArray3379 
{
	public static int[] constructTransformedArray(int[] nums)
	{
		int n=nums.length;
		int[] result=new int[n];

		for(int i=0;i<nums.length;i++)
		{
			int index;
			if(nums[i]>=0)
			{
				index=(i+nums[i])%n;
			}
			else
			{
				index=((i+nums[i]%n+n)%n);
			}
			result[i]=nums[index];
		}
		return result;
	}
	public static void main(String[] args)
	{
		int[] nums= {3,-2,1,1};
		System.out.println(Arrays.toString(constructTransformedArray(nums)));  // [1, 1, 1, 3]

		int[] nums2= {-1,4,-1};
		System.out.println(Arrays.toString(constructTransformedArray(nums2))); // [-1, -1, 4]

	}

}
