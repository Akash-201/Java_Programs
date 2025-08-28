package HackerRank;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference 
{
	public static int diagonalDifference(List<List<Integer>> arr)
	{

		int n = arr.size();
		int sum1 = 0, sum2 = 0;

		for (int i = 0; i < n; i++) 
		{
			sum1 += arr.get(i).get(i);          
			sum2 += arr.get(i).get(n - 1 - i);         
		}
		return Math.abs(sum1 - sum2);
	}

	public static void main(String[] args)
	{
		List<List<Integer>> arr = Arrays.asList(
				Arrays.asList(11, 2, 4),
				Arrays.asList(4, 5, 6),
				Arrays.asList(10, 8, -12)
				);

		System.out.println(diagonalDifference(arr)); 

	}


}
