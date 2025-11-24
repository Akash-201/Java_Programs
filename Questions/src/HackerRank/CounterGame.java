package HackerRank;

public class CounterGame 
{
	public static String counterGame(long n) 
	{
		int moves = 0;
		while (n > 1) 
		{
			if ((n & (n - 1)) == 0)
			{
				n >>= 1;
			} 
			else 
			{
				long highestPower = Long.highestOneBit(n);
				n -= highestPower;
			}
			moves++;
		}

		return (moves % 2 == 1) ? "Louise" : "Richard";
	}
	public static void main(String[] args) 
	{
		System.out.println(counterGame(6));

	}

}
