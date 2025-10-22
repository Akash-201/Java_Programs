package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WeightedUniformStrings 
{
	public static List<String> weightedUniformStrings(String s, List<Integer> queries) 
	{

		Set<Integer> weights = new HashSet<>();
		int currentWeight = 0;
		char previous = ' ';

		for (char c : s.toCharArray())
		{
			int weight = c - 'a' + 1;

			if (c == previous) 
			{
				currentWeight += weight; 
			} 
			else 
			{
				currentWeight = weight; 
			}

			weights.add(currentWeight);
			previous = c;
		}

		List<String> result = new ArrayList<>();
		for (int q : queries)
		{
			result.add(weights.contains(q) ? "Yes" : "No");
		}

		return result;
	}
	
	public static void main(String[] args)
	{
		String s="abccddde";
		List<Integer> queries=Arrays.asList(6,1,3,12,5,9,10);
		System.out.println(weightedUniformStrings(s, queries));  // [Yes, Yes, Yes, Yes, Yes, No, No]
		
		String s2="aaabbbbcccddd";
		List<Integer> queries2=Arrays.asList(5,9,7,8,12,5);
		System.out.println(weightedUniformStrings(s2, queries2));  // [No, Yes, No, Yes, Yes, No]
		
	}

}
