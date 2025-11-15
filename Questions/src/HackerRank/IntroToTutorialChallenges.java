package HackerRank;

import java.util.Arrays;
import java.util.List;

public class IntroToTutorialChallenges 
{
	public static int introTutorial(int V, List<Integer> arr)
	{

		for (int i = 0; i < arr.size(); i++)
		{
			if (arr.get(i) == V) 
			{
				return i;  
			}
		}
		return -1; 
	}
	
	public static void main(String[] args) 
	{
		List<Integer> arr=Arrays.asList(1,4,5,7,9,12);
		System.out.println(introTutorial(4,arr));
		
	}

}
