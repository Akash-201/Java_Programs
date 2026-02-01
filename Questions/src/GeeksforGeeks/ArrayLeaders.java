package GeeksforGeeks;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders 
{
	static ArrayList<Integer> leaders(int arr[]) 
	{
		ArrayList <Integer> list = new ArrayList<>();

		int suffix_max = arr[arr.length-1];

		for(int i = arr.length-1;i>=0;i--)
		{
			if (arr[i] >= suffix_max) 
			{
				list.add(arr[i]);
				suffix_max = arr[i];
			}
		}

		Collections.reverse(list);
		return list;

	}
	public static void main(String[] args) 
	{
		int[] arr= {16, 17, 4, 3, 5, 2};
		System.out.println(leaders(arr)); // [17, 5, 2]

		int[] arr2= {10, 4, 2, 4, 1};
		System.out.println(leaders(arr2)); // [10, 4, 4, 1]

		int[] arr3= {30, 10, 10, 5};
		System.out.println(leaders(arr3)); // [30, 10, 10, 5]

		int[] arr4= {5, 10, 20, 40};
		System.out.println(leaders(arr4)); // [40]

	}

}
