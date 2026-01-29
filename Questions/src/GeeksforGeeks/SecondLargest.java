package GeeksforGeeks;

import java.util.Arrays;

public class SecondLargest 
{
	public static int getSecondLargest(int[] arr) 
	{
		Arrays.sort(arr);
		int largest=arr[arr.length-1];
		int secondLargest=-1;
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]!=largest)
			{
				secondLargest=arr[i];
				break;
			}
		}
		return secondLargest;

	}
	public static void main(String[] args)
	{
		int[] arr= {12, 35, 1, 10, 34, 1};
		System.out.println(getSecondLargest(arr)); // 34

		int[] arr2= {10,5,10};
		System.out.println(getSecondLargest(arr2)); // 5

		int[] arr3= {10,10,10};
		System.out.println(getSecondLargest(arr3)); // -1

	}
}
