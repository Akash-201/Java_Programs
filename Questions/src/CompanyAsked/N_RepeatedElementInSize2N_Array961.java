package CompanyAsked;

/* LeetCode: 961 N-Repeated Element in Size 2N Array

You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.

Example 1:

Input: nums = [1,2,3,3]
Output: 3
Example 2:

Input: nums = [2,1,2,5,3,2]
Output: 2
Example 3:

Input: nums = [5,1,5,2,5,3,5,4]
Output: 5
 
Constraints:

2 <= n <= 5000
nums.length == 2 * n
0 <= nums[i] <= 104
nums contains n + 1 unique elements and one of them is repeated exactly n times.
*/

public class N_RepeatedElementInSize2N_Array961
{
	public static int repeatedNTimes(int[] nums) 
	{
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==-1)
				continue;

			int count=1;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
					nums[j]=-1;
				}
			}
			if(count>1)
				return nums[i];

		}
		return 0;
	}
	public static void main(String[] args)
	{
		int[] nums= {1,2,3,3};
		int[] nums2= {2,1,2,5,3,2};
		int[] nums3= {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(nums));
		System.out.println(repeatedNTimes(nums2));
		System.out.println(repeatedNTimes(nums3));
		
	}

}
