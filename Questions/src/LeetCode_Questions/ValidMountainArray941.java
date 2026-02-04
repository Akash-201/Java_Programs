package LeetCode_Questions;

// Leetcode:- 941. Valid Mountain Array

public class ValidMountainArray941 
{
	public static boolean validMountainArray(int[] arr) 
	{
		if(arr.length<3) return false;

		int i=0;
		for(;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				i++;
				break;
			}
			else if(arr[i]==arr[i+1])
			{
				return false;
			}
		}

		if(i<2) return false;

		for(;i<arr.length;i++)
		{
			if(arr[i-1]<=arr[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,1};
		System.out.println(validMountainArray(arr));  // false

		int[] arr2= {3,5,5};
		System.out.println(validMountainArray(arr2));  // false

		int[] arr3= {0,3,2,1};
		System.out.println(validMountainArray(arr3));  // true

	}

}
