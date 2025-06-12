package Sorting;

import java.util.Arrays;

public class BubbleSort
{
	public static void bubbleSort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}

			//If no swapping occurs in a round, the array is already sorted, and the loop breaks early for better performance.
			if(flag==0)
			{
				break;
			}
		}
		System.out.print(Arrays.toString(arr));

	}

	public static void main(String[] args)
	{
		int[] arr= {36,19,29,12,5};
		bubbleSort(arr);

	}

}
