package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsoluteDifferenceInaanArray 
{
	public static int minimumAbsoluteDifference(List<Integer> arr)
	{
		Collections.sort(arr);

		int minDiff = Integer.MAX_VALUE;

		for (int i = 0; i < arr.size() - 1; i++) 
		{
			int diff = Math.abs(arr.get(i) - arr.get(i + 1));
			minDiff = Math.min(minDiff, diff);
		}

		return minDiff;

	}
	public static void main(String[] args)
	{
		List<Integer> arr	= Arrays.asList(3,-7,0);
		System.out.println(minimumAbsoluteDifference(arr));
	}
}

