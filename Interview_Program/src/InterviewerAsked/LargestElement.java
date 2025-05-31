package InterviewerAsked;

import java.util.Arrays;

public class LargestElement 
{
	public static void findLargestElement(int[] arr)
	{
		Arrays.sort(arr);
		{
			System.out.println(arr[arr.length-1]);
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {6,3,61,38,4,87};
		findLargestElement(arr);
	}

}
