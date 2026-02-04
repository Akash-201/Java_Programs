package LeetCode_Questions;

import java.util.Arrays;

public class ConcatenationOfArray1929 
{
	public static int[] getConcatenation(int[] nums) 
	{
		int n=nums.length;
		int[] result=new int[n*2];
		for(int i=0;i<n;i++)
		{
			result[i]=nums[i];
			result[n+i]=nums[i];
		}
		return result;
	}

	public static void main(String[] args)
	{
		int[] nums= {1,2,1};
		int[] result=getConcatenation(nums);
		System.out.println(Arrays.toString(result));  //  [1, 2, 1, 1, 2, 1]

		int[] nums2= {1,3,2,1};
		int[] result2=getConcatenation(nums2);
		System.out.println(Arrays.toString(result2));  //  [1, 3, 2, 1, 1, 3, 2, 1]

	}

}
