package LeetCode_Questions;

import java.util.Arrays;

public class ShuffleTheArray1470 
{
	public static int[] shuffle(int[] nums, int n) 
	{
		int[] result=new int[nums.length];
		int count=0;
		for(int i=0;i<n;i++)
		{
			result[count]=nums[i];
			result[count+1]=nums[n+i];
			count+=2;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		int[] nums= {2,5,1,3,4,7};
		System.out.println(Arrays.toString(shuffle(nums, 3)));  // [2, 3, 5, 4, 1, 7]

		int[] nums2= {1,2,3,4,4,3,2,1};
		System.out.println(Arrays.toString(shuffle(nums2, 4)));  // [1, 4, 2, 3, 3, 2, 4, 1]

		int[] nums3= {1,1,2,2};
		System.out.println(Arrays.toString(shuffle(nums3, 2)));  // [1, 2, 1, 2]

	}

}
