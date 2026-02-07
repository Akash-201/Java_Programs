package LeetCode_Questions;

public class MonotonicArray896 
{
	public static boolean isMonotonic(int[] nums) 
	{
		boolean increasing=true;
		boolean decreasing=true;
		for(int i=1;i<nums.length;i++)
		{
			if(!(nums[i]>=nums[i-1]))
			{
				increasing=false;
			}
		}
		for(int i=1;i<nums.length;i++)
		{
			if(!(nums[i]<=nums[i-1]))
			{
				decreasing=false;

			}
		}
		return increasing || decreasing;
	}
	
	public static void main(String[] args) 
	{
		int[] nums= {1,2,2,3};
		System.out.println(isMonotonic(nums));  // true

		int[] nums2= {6,5,4,4};
		System.out.println(isMonotonic(nums2));  // true

		int[] nums3= {1,3,2};
		System.out.println(isMonotonic(nums3));  // false

	}
}
