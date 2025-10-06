package HackerRank;

public class ChocolateFeast
{
	public static int chocolateFeast(int n, int c, int m) 
	{

		int chocolates = n / c;
		int wrappers = chocolates;

		while (wrappers >= m) 
		{
			int extra = wrappers / m;
			chocolates += extra;
			wrappers = wrappers % m + extra;
		}

		return chocolates;
	}

	public static void main(String[] args)  
	{
		System.out.println(chocolateFeast(10,2,5));  // 6
		System.out.println(chocolateFeast(12,4,4));  // 3
		System.out.println(chocolateFeast(6,2,2));   // 5
	}


}
