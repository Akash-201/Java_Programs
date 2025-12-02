package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BeautifulTriplets 
{
	public static int beautifulTriplets(int d, List<Integer> arr)
	{
		Set<Integer> set = new HashSet<>(arr);
		int count = 0;

		for (int x : arr)
		{
			if (set.contains(x + d) && set.contains(x + 2*d))
			{
				count++;
			}
		}

		return count;

	}
	public static void main(String[] args)
	{
		List<Integer> arr=Arrays.asList(1, 2, 4, 5, 7, 8, 10);
		System.out.println(beautifulTriplets(3, arr));

	}


}
