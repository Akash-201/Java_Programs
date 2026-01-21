package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pairs 
{
	public static int pairs(int k, List<Integer> arr)
	{

		Set<Integer> set = new HashSet<>(arr);
		int count = 0;

		for (int num : arr) 
		{
			if (set.contains(num + k)) 
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		List<Integer> arr=Arrays.asList(1,2,3,4);
		System.out.println(pairs(1,arr));  // 3

		List<Integer> arr2=Arrays.asList(1, 5, 3, 4, 2);
		System.out.println(pairs(2,arr2));  // 3

	}

}
