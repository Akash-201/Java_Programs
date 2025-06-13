package Sorting;

import java.util.Arrays;

public class SelectionSortForString
{
	public static void sortElement(String[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			int minimum=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[minimum].compareTo(arr[j])>0)
				{
					minimum=j;
					
				}
			}
			String temp=arr[i];
			arr[i]=arr[minimum];
			arr[minimum]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args)
	{
		String[] arr= {"Deepak","Rahul","Ramesh","Amit","Abhi"};
		sortElement(arr);
	}

}
