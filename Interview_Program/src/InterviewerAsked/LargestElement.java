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
		System.out.println(arr[arr.length-1]);
		
		
		
		
	}
	public static void main(String[] args)
	{
		int[] arr= {6,7,98,123};
		findLargestElement(arr);
	}

}
