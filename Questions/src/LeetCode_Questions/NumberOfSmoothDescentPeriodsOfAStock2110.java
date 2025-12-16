package LeetCode_Questions;

// 2110. Number of Smooth Descent Periods of a Stock

public class NumberOfSmoothDescentPeriodsOfAStock2110 
{
	public static long getDescentPeriods(int[] prices) 
	{
		long ans = 1;
		long streak = 1;

		for (int i = 1; i < prices.length; i++) 
		{
			if (prices[i] == prices[i - 1] - 1)
			{
				streak += 1;
			} 
			else 
			{
				streak = 1;
			}

			ans += streak;
		}

		return ans;
	}
	public static void main(String[] args)
	{
		int[] prices= {3,2,1,4};
		System.out.println(getDescentPeriods(prices)); // 7
		
		int[] prices2= {8,6,7,7};
		System.out.println(getDescentPeriods(prices2)); // 4
		
		int[] prices3= {1};
		System.out.println(getDescentPeriods(prices3)); // 1
		
	}

}
