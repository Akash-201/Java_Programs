package GeeksforGeeks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDuplicates 
{
	public  static ArrayList<Integer> findDuplicates(int[] arr)
	{
		ArrayList<Integer> result=new ArrayList<>();
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]==arr[i-1])
			{
				result.add(arr[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{
		int[] arr= {2, 3, 1, 2, 3};
		System.out.println(findDuplicates(arr)); // [2,3]

		int[] arr2= {3,1,2};
		System.out.println(findDuplicates(arr2)); // []
	}
}


