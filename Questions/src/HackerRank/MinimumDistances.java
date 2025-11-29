package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistances 
{
	public static int minimumDistances(List<Integer> a) 
	{
		Map<Integer, Integer> map = new HashMap<>();
		int minDist = Integer.MAX_VALUE;

		for (int i = 0; i < a.size(); i++)
		{
			int val = a.get(i);
			if (map.containsKey(val)) 
			{
				int dist = i - map.get(val);
				minDist = Math.min(minDist, dist);
			}
			map.put(val, i);
		}

		return (minDist == Integer.MAX_VALUE) ? -1 : minDist;
	}
	public static void main(String[] args) 
	{
		List<Integer> a=Arrays.asList(7, 1, 3, 4, 1, 7);
		System.out.println(minimumDistances(a));
		
	}


}
