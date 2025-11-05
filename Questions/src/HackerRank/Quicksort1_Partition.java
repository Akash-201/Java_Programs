package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quicksort1_Partition 
{
	public static List<Integer> quickSort(List<Integer> arr) 
	{
		int pivot = arr.get(0);
		List<Integer> left = new ArrayList<>();
		List<Integer> equal = new ArrayList<>();
		List<Integer> right = new ArrayList<>();

		for (int num : arr) 
		{
			if (num < pivot)
				left.add(num);
			else if (num == pivot)
				equal.add(num);
			else
				right.add(num);
		}


		List<Integer> result = new ArrayList<>();
		result.addAll(left);
		result.addAll(equal);
		result.addAll(right);

		return result;

	}
	public static void main(String[] args) 
	{
		List<Integer> arr= Arrays.asList(4,5,3,7,2);
		System.out.println(quickSort(arr)); // [3, 2, 4, 5, 7]
		
	}

}
