package Array;

//Sort an Array Without Using Built-in Methods

import java.util.Arrays;

public class SortArray 
{
	public static void sortArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		int[] arr= {4,6,2,9,33,24,1,7,0,-8};
		sortArray(arr);
	}

}
