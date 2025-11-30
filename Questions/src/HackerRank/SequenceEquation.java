package HackerRank;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation 
{
	public static List<Integer> permutationEquation(List<Integer> p)
	{
		int n = p.size();
		int[] pos = new int[n + 1];


		for (int i = 0; i < n; i++) 
		{
			pos[p.get(i)] = i + 1;   
		}

		List<Integer> result = new ArrayList<>();


		for (int x = 1; x <= n; x++)
		{
			int y = pos[pos[x]];
			result.add(y);
		}

		return result;

	}
	public static void main(String[] args) 
	{
		List<Integer> p=Arrays.asList(4,3,5,1,2);
		System.out.println(permutationEquation(p));
		
	}


}
