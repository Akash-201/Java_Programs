package HackerRank;

public class HalloweenSale 
{
	public static int howManyGames(int p, int d, int m, int s) 
	{
		int count = 0;
		int currentPrice = p;
		int totalSpent = 0;

		while (totalSpent + currentPrice <= s)
		{
			totalSpent += currentPrice;
			count++;
			currentPrice = Math.max(currentPrice - d, m);
		}

		return count;
	}
	public static void main(String[] args)
	{
		System.out.println(howManyGames(20,3,6,80)); // 6
		System.out.println(howManyGames(20,3,6,85)); // 7
	}
}
