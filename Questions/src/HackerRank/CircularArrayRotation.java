package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation
{
	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) 
	{

		int n = a.size();
		k = k % n;  
		List<Integer> result = new ArrayList<>();
		for (int queryIndex : queries) 
		{
			int originalIndex = (queryIndex - k + n) % n;
			result.add(a.get(originalIndex));
		}

		return result;
	}

	public static void main(String[] args)
	{
		List<Integer> a=Arrays.asList(3,4,5);
		int k=2;
		List<Integer> queries=Arrays.asList(1,2);
		System.out.println(circularArrayRotation(a, k, queries));

	}

}
