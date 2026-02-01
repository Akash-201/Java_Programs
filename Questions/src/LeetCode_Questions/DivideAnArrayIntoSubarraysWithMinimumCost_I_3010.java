package LeetCode_Questions;

// LeetCode:- 3010. Divide an Array Into Subarrays With Minimum Cost I

public class DivideAnArrayIntoSubarraysWithMinimumCost_I_3010 
{
	public static int minimumCost(int[] nums) 
	{
		int n=nums.length;
		int firstMin=nums[0];
		int secondMin=Integer.MAX_VALUE;
		int thirdMin=Integer.MAX_VALUE;

		for(int i=1;i<n;i++)
		{
			if(nums[i]<secondMin)
			{
				thirdMin=secondMin;
				secondMin=nums[i];
			}
			else if(nums[i]<thirdMin)
			{
				thirdMin=nums[i];
			}
		}
		return firstMin+secondMin+thirdMin;
	}
	public static void main(String[] args) 
	{
		int[] nums= {1,2,3,12};
		System.out.println(minimumCost(nums));  // 6

		int[] nums2= {5,4,3};
		System.out.println(minimumCost(nums2));  // 12

		int[] nums3= {10,3,1,1};
		System.out.println(minimumCost(nums3));  // 12

	}

}
