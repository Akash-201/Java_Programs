package Arrays;

// using sorting

import java.util.Arrays;

public class SecondLargest 
{
	public static int secondLargest(int[] arr)
	{
		Arrays.sort(arr);
		int largest=arr[arr.length-1];
		int secondLargest=Integer.MIN_VALUE;
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
		int[] arr= {11,11,11};
		System.out.println("Second Largest Element Is: "+secondLargest(arr));
		
	}

}
