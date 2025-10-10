package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ManasaAndStones
{
	public static List<Integer> stones(int n, int a, int b) 
	{

		Set<Integer> resultSet = new HashSet<>();

		// (n-1) gaps between n stones
		for (int i = 0; i < n; i++) 
		{
			int value = i * b + (n - 1 - i) * a;
			resultSet.add(value);
		}

		// Convert to list and sort
		List<Integer> result = new ArrayList<>(resultSet);
		Collections.sort(result);

		return result;
	}
	public static void main(String[] args) 
	{

		System.out.println(stones(3,1,2));    // [2, 3, 4]
		System.out.println(stones(4,10,100)); // [30, 120, 210, 300]
	}

}
