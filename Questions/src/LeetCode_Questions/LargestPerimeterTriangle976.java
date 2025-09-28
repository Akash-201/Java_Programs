package LeetCode_Questions;

// LeetCode: 976. Largest Perimeter Triangle

import java.util.Arrays;

public class LargestPerimeterTriangle976 
{
	public static int largestPerimeter(int[] nums) 
	{
        Arrays.sort(nums);
        int longestParameter=0;
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]+nums[i+1]>nums[i+2])
            {
                longestParameter=Math.max(longestParameter,
                                           nums[i]+nums[i+1]+nums[i+2]);
            }
        }
        return longestParameter;
    }
	public static void main(String[] args) 
	{
		int[] nums={2,1,2};
		System.out.println(largestPerimeter(nums));  // 5
		
		int[] nums2={1,2,1,10};
		System.out.println(largestPerimeter(nums2));  // 0
	}

}
