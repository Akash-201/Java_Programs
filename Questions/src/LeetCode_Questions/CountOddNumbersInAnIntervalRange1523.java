package LeetCode_Questions;

// Leetcode:- 1523. Count Odd Numbers in an Interval Range

public class CountOddNumbersInAnIntervalRange1523 
{
	public static int countOdds(int low, int high)
	{
		int ans=(high-low+1)/2;
		if(high%2==1 && low%2==1)
			return ans+1;
		return ans;
	}
	public static void main(String[] args)
	{
		System.out.println(countOdds(3,7));  // 3
		System.out.println(countOdds(8,10)); // 1
		
	}

}
