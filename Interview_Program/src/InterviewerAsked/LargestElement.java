package InterviewerAsked;

import java.util.Arrays;

public class LargestElement 
{
	public static void findLargestElement(int[] arr)
	{
		
		// using sorting method
//		Arrays.sort(arr);
//		{
//			System.out.println(arr[arr.length-1]);
//		}
		
		
		// if Array already sorted
//		System.out.println(arr[arr.length-1]);
		
		
		
		// if Array is not sorted and without using sorting method
		int largestElement=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largestElement)
			{
				largestElement=arr[i];
			}
		}
		
		System.out.println(largestElement);
		
	}
	public static void main(String[] args)
	{
		int[] arr= {6,3,65,89,46,98,67};
		findLargestElement(arr);
	}

}
