package Arrays;

// using sorting method

import java.util.Arrays;

public class SecondSmallest
{
	public static int secondSmallestElement(int[] arr)
	{
		Arrays.sort(arr);
		int smallest=arr[0];
		int secondSmallest=-1;

		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=smallest)
			{
				secondSmallest=arr[i];

				break;
			}
		}
		return secondSmallest;
	}
	public static void main(String[] args)
	{
		int[] arr= {53,75,25,75,356};
		System.out.println("Second Smallest Element is: "+secondSmallestElement(arr));

	}

}
