package String;

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
		
		
		
	}
	public static void main(String[] args)
	{
		int[] arr1= {1,3};
		int[] arr2= {2};
		median(arr1, arr2);		
	}

}
