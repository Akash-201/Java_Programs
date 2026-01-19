package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumPerimeterTriangle 
{
	public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) 
	{
		Collections.sort(sticks);

		for (int i = sticks.size() - 1; i >= 2; i--) 
		{

			int a = sticks.get(i - 2);
			int b = sticks.get(i - 1);
			int c = sticks.get(i);

			if (a + b > c) 
			{
				return Arrays.asList(a, b, c);
			}
		}
		return Arrays.asList(-1);
	}

	public static void main(String[] args) 
	{
		List<Integer> sticks=Arrays.asList(1,1,1,3,3);
		System.out.println(maximumPerimeterTriangle(sticks));  // [1, 3, 3]

		List<Integer> sticks2=Arrays.asList(1,2,3);
		System.out.println(maximumPerimeterTriangle(sticks2));  // [-1]
	}

}
