package LeetCode_Questions;

// Leetcode:- 88. Merge Sorted Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray88 
{
	public static void merge(int[] nums1, int m, int[] nums2, int n)
	{
		ArrayList<Integer> result=new ArrayList<>();
		for(int i=0;i<m;i++)
		{
			result.add(nums1[i]);
		}
		for(int j=0;j<n;j++)
		{
			result.add(nums2[j]);
		}
		Collections.sort(result);

		for (int i = 0; i < result.size(); i++)
		{
			nums1[i] = result.get(i);
		}
	}
	public static void main(String[] args)
	{
		int[] nums1= {1,2,3,0,0,0};
		int[] nums2= {2,5,6};
		merge(nums1, 3, nums2,3);
		System.out.println(Arrays.toString(nums1));  // [1, 2, 2, 3, 5, 6]

		int[] nums3= {1};
		int[] nums4= {};
		merge(nums3, 1, nums4,0);
		System.out.println(Arrays.toString(nums3));  // [1]

		int[] nums5= {0};
		int[] nums6= {1};
		merge(nums5, 0, nums6,1);
		System.out.println(Arrays.toString(nums5));  // [1]

	}
}
