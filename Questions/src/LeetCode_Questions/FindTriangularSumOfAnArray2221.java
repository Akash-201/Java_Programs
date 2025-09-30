package LeetCode_Questions;

// LeetCode: 2221. Find Triangular Sum of an Array

public class FindTriangularSumOfAnArray2221 
{
	public static  int triangularSum(int[] nums)
	{
		int n=nums.length;
		for(int len=n;len>1;len--)
		{
			for(int i=0;i<len-1;i++)
			{
				nums[i]=(nums[i]+nums[i+1])%10;
			}
		}
		return nums[0];

	}
	public static void main(String[] args) 
	{
		int[] nums= {1,2,3,4,5};
		System.out.println(triangularSum(nums));  // 8

		int[] nums2= {5};
		System.out.println(triangularSum(nums2)); // 5
	}

}
