package Sorting;

import java.util.Arrays;

public class InsertionSortForString 
{
	public static void sortElement(String[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			String temp=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j].compareTo(temp)>0)
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		String[] arr= {"Deepak","Rahul","Ramesh","Amit","Abhi"};
		sortElement(arr);
	}

}
