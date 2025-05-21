package CompanyQuestions;



public class BestTimeToBuyAndSellStock
{
	public static  int maxProfit(int[] prices)
	{
		int min=prices[0];
		int answer=0;

		for(int i=1;i<prices.length;i++) 
		{
			int profit=prices[i]-min;
			if(profit>answer)
			{
				answer=profit;
			}

			min=Math.min(prices[i],min);
		}
		return answer;

	}
	public static void main(String[] args) 
	{
		int[] prices= {7,1,5,3,6,4};
		int[] prices1= {7,6,4,3,1};
		System.out.println(maxProfit(prices));
		System.out.println(maxProfit(prices1));

	}

}
