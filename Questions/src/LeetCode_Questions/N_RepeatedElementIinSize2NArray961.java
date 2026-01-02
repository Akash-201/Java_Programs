package LeetCode_Questions;

// LeetCode: 961. N-Repeated Element in Size 2N Array

public class N_RepeatedElementIinSize2NArray961 
{
	public static int repeatedNTimes(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			int count=0;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
				}
			}
			if(count>=nums.length/2)
			{
				return nums[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		int[] nums= {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(nums));  // 5

		int[] nums2= {1,2,3,3};
		System.out.println(repeatedNTimes(nums2));  // 3

		int[] nums3= {2,1,2,5,3,2};
		System.out.println(repeatedNTimes(nums3));  // 2
	}

}
