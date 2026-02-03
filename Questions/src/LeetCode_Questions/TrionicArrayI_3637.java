package LeetCode_Questions;

// LeetCode:- 3637. Trionic Array I

public class TrionicArrayI_3637 
{
	public static boolean isTrionic(int[] nums) 
	{
		int i=1;
		while(i<nums.length && nums[i]>nums[i-1])
		{
			i++;
		}
		if(i==1 || i==nums.length)
		{
			return false;
		}

		while(i<nums.length && nums[i]<nums[i-1])
		{
			i++;
		}
		if(i==nums.length)
		{
			return false;
		}

		while(i<nums.length && nums[i]>nums[i-1])
		{
			i++;
		}
		return (i==nums.length) ? true : false;
	}
	public static void main(String[] args) 
	{
		int[] nums= {1,3,5,4,2,6};
		System.out.println(isTrionic(nums));  // true

		int[] nums2= {2,1,3};
		System.out.println(isTrionic(nums2));  // false
	}

}
