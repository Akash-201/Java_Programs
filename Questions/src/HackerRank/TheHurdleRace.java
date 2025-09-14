package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TheHurdleRace 
{
	public static int hurdleRace(int k, List<Integer> height) 
	{
		int maxHeight = Collections.max(height);
		int potionsNeeded = maxHeight - k;
		return Math.max(potionsNeeded, 0);

	}
	public static void main(String[] args)
	{
		int k=4;
		int k2=7;
		List<Integer>height=Arrays.asList(1,6,3,5,2);
		List<Integer>height2=Arrays.asList(2,5,4,5,2);

		System.out.println(hurdleRace(k, height));   //2
		System.out.println(hurdleRace(k2, height2)); //0 


	}

}
