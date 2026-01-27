package HackerRank;

public class Restaurant 
{
	public static int restaurant(int l, int b) 
	{
		int gcd = gcd(l, b);

		return (l / gcd) * (b / gcd);
	}

	private static int gcd(int a, int b) 
	{
		while (b != 0) 
		{
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		System.out.println(restaurant(2,2));  // 1
		System.out.println(restaurant(6,9));  // 6
	}

}
