package HackerRank;

import java.util.Arrays;

public class FlatlandSpaceStations 
{
	public static int flatlandSpaceStations(int n, int[] c) 
	{
		Arrays.sort(c);

		int maxDist = 0;

		// Distance from city 0 to the first station
		maxDist = c[0] - 0;

		// Check distances between consecutive stations
		for (int i = 1; i < c.length; i++) 
		{
			int dist = (c[i] - c[i - 1]) / 2;
			if (dist > maxDist) 
			{
				maxDist = dist;
			}
		}

		// Distance from last station to the last city
		int lastDist = (n - 1) - c[c.length - 1];
		if (lastDist > maxDist)
		{
			maxDist = lastDist;
		}

		return maxDist;
	}
	public static void main(String[] args)
	{
		int n=5;
		int[] c= {0,4};
		System.out.println(flatlandSpaceStations(n, c));  // 2

		int n2=5;
		int[] c2= {0,1,2,3,4,5};
		System.out.println(flatlandSpaceStations(n2, c2));  // 0

	}


}
