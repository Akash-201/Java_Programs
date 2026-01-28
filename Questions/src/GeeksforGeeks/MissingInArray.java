package GeeksforGeeks;

import java.util.Arrays;

public class MissingInArray 
{
	public static int missingNum(int arr[])
	{
		Arrays.sort(arr);
		int expected=1;
		for(int num : arr)
		{
			if(num!=expected)
			{
				return expected;
			}
			expected++;
		}
		return expected;
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,5};
		System.out.println(missingNum(arr));  // 4

		int arr2[]= {8, 2, 4, 5, 3, 7, 1};
		System.out.println(missingNum(arr2)); // 6

		int arr3[]= {1};
		System.out.println(missingNum(arr3)); // 2

	}

}
