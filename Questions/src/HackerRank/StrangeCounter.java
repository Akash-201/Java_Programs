package HackerRank;

public class StrangeCounter 
{
	public static long strangeCounter(long t) 
	{
		long cycleStart = 1;
		long cycleValue = 3;

		// Find the cycle in which 't' lies
		while (t > cycleStart + cycleValue - 1) 
		{
			cycleStart += cycleValue;
			cycleValue *= 2;
		}

		// Calculate remaining value
		return cycleValue - (t - cycleStart);
	}
	public static void main(String[] args) 
	{
		System.out.println(strangeCounter(4));
	}

}
