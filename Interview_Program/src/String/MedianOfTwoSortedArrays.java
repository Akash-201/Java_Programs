package String;
//
//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//Example 1:

//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.

//Example 2:

//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

import java.util.Arrays;

public class MedianOfTwoSortedArrays 
{
	public static void median(int[] arr1,int[] arr2)
	{
		int[] mergedArr=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			mergedArr[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			mergedArr[arr1.length+i]=arr2[i];
		}
		
		Arrays.sort(mergedArr);
		System.out.println("Merged and Sorted Array: " + Arrays.toString(mergedArr));
		
		double median;
		int n=mergedArr.length;
		if(n%2==0)
		{
			median=(mergedArr[n/2-1]+mergedArr[n/2])/2.0;
		}
		else
		{
			median=mergedArr[n/2];
		}
		
		System.out.println("Median is: " + median);
		
		
		
	}
	public static void main(String[] args)
	{
		int[] arr1= {1,2};
		int[] arr2= {3,4};
		median(arr1, arr2);		
	}

}
