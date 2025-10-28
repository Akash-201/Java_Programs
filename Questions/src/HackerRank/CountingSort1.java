package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort1 
{
	public static List<Integer> countingSort(List<Integer> arr) 
	{
		int[] count = new int[100];


		for (int num : arr)
		{
			count[num]++;
		}


		List<Integer> result = new ArrayList<>();
		for (int c : count)
		{
			result.add(c);
		}

		return result;
	}
	
	public static void main(String[] args) 
	{
	List<Integer> arr=Arrays.asList(1, 1, 3, 2, 1);
	System.out.println(countingSort(arr));
	}

}
