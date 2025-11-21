package HackerRank;

import java.util.Arrays;
import java.util.List;

public class LonelyInteger
{
	public static int lonelyinteger(List<Integer> a) 
	{
		int result = 0;
		for (int num : a) 
		{
			result ^= num; // XOR all numbers
		}
		return result;

	}
	public static void main(String[] args) 
	{
		List<Integer> a=Arrays.asList(0,0,1,2,1);
		System.out.println(lonelyinteger(a));
		
	}

}
