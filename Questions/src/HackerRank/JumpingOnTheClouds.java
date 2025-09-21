package HackerRank;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds
{
	public static int jumpingOnClouds(List<Integer> c)
	{
		int jumps = 0;
		int i = 0;

		while (i < c.size() - 1) 
		{
			// if we can jump 2 steps safely, do it
			if (i + 2 < c.size() && c.get(i + 2) == 0)
			{
				i += 2;
			}
			else 
			{
				i += 1;
			}
			jumps++;
		}

		return jumps;
	}

	public static void main(String[] args) 
	{
		List<Integer> c=Arrays.asList(0, 0, 1, 0, 0, 1, 0);
		System.out.println(jumpingOnClouds(c));  // 4

		List<Integer> c2=Arrays.asList(0, 0, 0, 0, 1, 0);
		System.out.println(jumpingOnClouds(c2)); // 3
	}

}
