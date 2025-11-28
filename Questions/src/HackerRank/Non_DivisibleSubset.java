package HackerRank;

import java.util.Arrays;
import java.util.List;

public class Non_DivisibleSubset
{
	public static int nonDivisibleSubset(int k, List<Integer> s) 
	{
		int[] freq = new int[k];


		for (int num : s) 
		{
			freq[num % k]++;
		}

		int result = 0;


		if (freq[0] > 0) result++;


		for (int i = 1; i <= k / 2; i++) 
		{
			if (i == k - i) 
			{ 
				if (freq[i] > 0) result++;
			} 
			else 
			{
				result += Math.max(freq[i], freq[k - i]);
			}
		}

		return result;

	}
	public static void main(String[] args) 
	{
		List<Integer> s= Arrays.asList(1,7,2,4);
		System.out.println(nonDivisibleSubset(3,s));
		
	}

}
