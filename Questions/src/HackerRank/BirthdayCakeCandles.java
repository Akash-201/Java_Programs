package HackerRank;

import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles
{
	public static int birthdayCakeCandles(List<Integer> candles)
	{
		int tallest=Integer.MIN_VALUE;
		int count=0;
		for(int height : candles)
		{
			if(height > tallest)
			{
				tallest=height;
				count=1;
			}
			else if(height == tallest)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		List<Integer> candles=Arrays.asList(4,4,1,3);
		List<Integer> candles2=Arrays.asList(3,2,3,1,3);

		System.out.println(birthdayCakeCandles(candles));  // 2
		System.out.println(birthdayCakeCandles(candles2)); // 3

	}

}
