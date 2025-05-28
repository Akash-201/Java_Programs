package Array;

// LeetCode:- 75 Sort Colors
//Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
//with the colors in the order red, white, and blue.

//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

//You must solve this problem without using the library's sort function.

//Example 1:

//Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
//Example 2:

//Input: nums = [2,0,1]
//Output: [0,1,2]

import java.util.Arrays;

public class SortColors
{
	public static void sortColors(int[] arr)
	{
		int left=0;
		int right=arr.length-1;

		int i=0;
		while(i<=right)
		{
			if(arr[i]==0)
			{
				int temp=arr[left];
				arr[left]=arr[i];
				arr[i]=temp;
				left++;
				i++;
			}
			else if(arr[i]==2)
			{
				int temp=arr[right];
				arr[right]=arr[i];
				arr[i]=temp;
				right--;
			}
			else
			{
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		int[] arr= {2,0,2,1,1,0};
		sortColors(arr);	
	}

}
