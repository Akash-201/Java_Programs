package HackerRank;

import java.util.Arrays;
import java.util.List;

public class InsertionSort_Part2
{
	public static void insertionSort2(int n, List<Integer> arr)
	{

		for (int i = 1; i < n; i++) 
		{

			int key = arr.get(i);
			int j = i - 1;

			while (j >= 0 && arr.get(j) > key) 
			{
				arr.set(j + 1, arr.get(j));
				j--;
			}

			arr.set(j + 1, key);

			// Print array after each step
			printList(arr);
		}
	}

	private static void printList(List<Integer> arr) 
	{
		StringBuilder sb = new StringBuilder();
		for (int num : arr)
		{
			sb.append(num).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
	public static void main(String[] args) 
	{
		List<Integer> arr=Arrays.asList(1, 4, 3, 5, 6, 2);
		insertionSort2(6, arr);

	}


}
