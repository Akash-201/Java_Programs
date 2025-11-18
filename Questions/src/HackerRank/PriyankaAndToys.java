package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PriyankaAndToys 
{
	public static int toys(List<Integer> w)
	{
		Collections.sort(w);

		int count = 1;  
		int currentLimit = w.get(0) + 4;  

		for (int weight : w) {
			if (weight > currentLimit)
			{
				count++;                 
				currentLimit = weight + 4;
			}
		}

		return count;

	}

	public static void main(String[] args) 
	{
		List<Integer> w=Arrays.asList(1, 2,3,21,7,12,14,21);
		System.out.println(toys(w));

	}

}
