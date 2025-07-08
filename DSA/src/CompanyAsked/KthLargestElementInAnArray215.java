package CompanyAsked;

//Leetcode: 215. Kth Largest Element in an Array

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
