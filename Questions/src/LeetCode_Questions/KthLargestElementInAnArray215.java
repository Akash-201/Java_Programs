package LeetCode_Questions;

/*
Leetcode: 215. Kth Largest Element in an Array

Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 
Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104

*/

import java.util.PriorityQueue;

public class KthLargestElementInAnArray215
{
	public static int findKthLargest(int[] nums, int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		for(int val : nums )
		{
			pq.add(val);
			if(pq.size()>k)
			{
				pq.remove();
			}
		}
		return pq.peek();
		
	}
	
	public static void main(String[] args)
	{
	  int[] nums= {3,2,1,5,6,4};
	  int k=2;
	  System.out.println(findKthLargest(nums, k));
	}

}
