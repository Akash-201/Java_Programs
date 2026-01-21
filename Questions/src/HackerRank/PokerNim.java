package HackerRank;

import java.util.Arrays;
import java.util.List;

public class PokerNim 
{
	public static String pokerNim(int k, List<Integer> c) 
	{
		int sum=0;
		for(int num : c)
		{
			sum^=num;
		}
		return sum==0 ? "Second" : "First";
	}
	public static void main(String[] args) 
	{
		List<Integer> c=Arrays.asList(1,2);
		System.out.println(pokerNim(5,c));  // First

		List<Integer> c2=Arrays.asList(2,1,3);
		System.out.println(pokerNim(5,c2));  // Second

	}

}
