package LeetCode_Questions;

import java.util.Arrays;

// Leetcode:- 189. Rotate Array

public class RotateArray189 
{
	public static void rotate(int[] nums, int k) 
	{
		int n=nums.length;
		k=k%n;
		rotateArray(nums,0,n-1);
		rotateArray(nums,0,k-1);
		rotateArray(nums,k,n-1);

		System.out.println(Arrays.toString(nums));

	}
	private static void rotateArray(int[] nums,int start, int end)
	{
		while(start<end)
		{
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) 
	{
		int[] nums= {1,2,3,4,5,6,7};
		rotate(nums,3);  // [5, 6, 7, 1, 2, 3, 4]

		int[] nums2= {-1,-100,3,99};
		rotate(nums2,2);  // [3, 99, -1, -100]

	}

}
