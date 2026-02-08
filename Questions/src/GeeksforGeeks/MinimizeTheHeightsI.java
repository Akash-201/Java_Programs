package GeeksforGeeks;

import java.util.Arrays;

public class MinimizeTheHeightsI 
{
	public static int getMinDiff(int[] arr, int k)
	{
		int n = arr.length;

		// Sort the array
		Arrays.sort(arr);

		// Initial difference
		int ans = arr[n - 1] - arr[0];

		// Initial smallest and largest values
		int smallest = arr[0] + k;
		int largest = arr[n - 1] - k;

		// Traverse remaining elements
		for (int i = 1; i < n; i++) 
		{

			int minHeight = Math.min(smallest, arr[i] - k);
			int maxHeight = Math.max(largest, arr[i - 1] + k);

			ans = Math.min(ans, maxHeight - minHeight);
		}

		return ans;
	}
	public static void main(String[] args)
	{
		int[] arr= {1, 5, 8, 10};
		System.out.println(getMinDiff(arr, 2));  // 5

		int[] arr2= {3, 9, 12, 16, 20};
		System.out.println(getMinDiff(arr2,3));  // 11


	}

}
