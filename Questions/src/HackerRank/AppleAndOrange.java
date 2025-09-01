package HackerRank;

import java.util.List;

public class AppleAndOrange 
{
	public static void countApplesAndOranges(
			int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) 
	{

		int applesOnHouse = 0;
		int orangesOnHouse = 0;

		for (int d : apples) 
		{
			int pos = a + d;
			if (pos >= s && pos <= t) applesOnHouse++;
		}

		for (int d : oranges) 
		{
			int pos = b + d;
			if (pos >= s && pos <= t) orangesOnHouse++;
		}

		System.out.println(applesOnHouse);
		System.out.println(orangesOnHouse);
	}

	public static void main(String[] args) 
	{
		int s = 7;  // house start
		int t = 11; // house end
		int a = 5;  // apple tree location
		int b = 15; // orange tree location

		List<Integer> apples = List.of(-2, 2, 1);
		List<Integer> oranges = List.of(5, -6);

		countApplesAndOranges(s, t, a, b, apples, oranges);

	}

}
