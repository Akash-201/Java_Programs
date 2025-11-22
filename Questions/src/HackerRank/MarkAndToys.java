package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarkAndToys
{
	public static int maximumToys(List<Integer> prices, int k) 
	{
		Collections.sort(prices); 
		int count = 0;
		int sum = 0;

		for (int price : prices)
		{
			if (sum + price <= k)
			{
				sum += price;
				count++;
			} else
			{
				break;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		List<Integer> prices=Arrays.asList(1, 12, 5, 111, 200, 1000, 10);
		System.out.println(maximumToys(prices, 50));
		
	}

}
