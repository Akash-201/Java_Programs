package HackerRank;

public class ClosestNumber 
{
	public static int closestNumber(int a, int b, int x) 
	{
		long power = (long) Math.pow(a, b);

		long lower = (power / x) * x;
		long upper = lower + x;

		if (power - lower <= upper - power) 
		{
			return (int) lower;
		} 
		else
		{
			return (int) upper;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println(closestNumber(349,1,4));  // 348
		System.out.println(closestNumber(395,1,7));  // 392
		System.out.println(closestNumber(4,-2,2));   // 0

	}

}
