package LeetCode_Questions;

// LeetCode: 611. Valid Triangle Number

import java.util.Arrays;

public class ValidTriangleNumber611 
{
	public static int triangleNumber(int[] nums) 
	{
		Arrays.sort(nums);
		int count=0;
		int n=nums.length;
		for(int c=n-1;c>=2;c--)
		{
			int a=0,b=c-1;

			while(a<b)
			{
				if(nums[a]+nums[b]>nums[c])
				{
					count+=(b-a);
					b-=1;
				}
				else
				{
					a+=1;
				}
			}
		}
		return count;

	}
	public static void main(String[] args)
	{
		int[] nums= {2,2,3,4};
		int[] nums2= {4,2,3,4};
		System.out.println(triangleNumber(nums));  // 3
		System.out.println(triangleNumber(nums2)); // 4

	}

}
