package Sorting;

import java.util.Arrays;

public class SelectionSort
{
	public static void sortElement(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int minimum=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minimum]>arr[j])
				{
					minimum=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minimum];
			arr[minimum]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		int[] arr= {38,52,9,18,6,62,13};
		sortElement(arr);
	}

}
