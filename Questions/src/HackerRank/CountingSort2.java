package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort2 
{
	public static List<Integer> countingSort(List<Integer> arr)
	{

		int[] count = new int[100];

		for (int num : arr) 
		{
			count[num]++;
		}


		List<Integer> sortedList = new ArrayList<>();
		for (int i = 0; i < count.length; i++) 
		{
			for (int j = 0; j < count[i]; j++)
			{
				sortedList.add(i);
			}
		}

		return sortedList;
	}
	
	public static void main(String[] args) 
	{
		List<Integer> arr=Arrays.asList(1,1,3,2,1);
		System.out.println(countingSort(arr));
		
	}
}

