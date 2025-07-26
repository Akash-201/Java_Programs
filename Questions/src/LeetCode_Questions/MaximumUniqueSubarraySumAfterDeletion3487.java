package LeetCode_Questions;

import java.util.HashSet;
import java.util.Set;

public class MaximumUniqueSubarraySumAfterDeletion3487 
{
	public static int maxSum(int[] nums)
	{
		Set<Integer> uniqueValue=new HashSet<>();
		int result=0;
		int maxNegativeNumber=Integer.MIN_VALUE;
		
		for(int num : nums)
		{
			if(num>0)
			{
				uniqueValue.add(num);
			}
			else
			{
				maxNegativeNumber=Math.max(maxNegativeNumber, num);
			}
		}
		for(int num : uniqueValue)
		{
			result+=num;
		}
		
		return result == 0 ? maxNegativeNumber : result;
		
	}
	public static void main(String[] args) 
	{
		int[] nums= {1,2,3,4,5};
		System.out.println(maxSum(nums));
		
	}

}
