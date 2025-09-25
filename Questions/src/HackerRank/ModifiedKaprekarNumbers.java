package HackerRank;

public class ModifiedKaprekarNumbers 
{
	public static void kaprekarNumbers(int p, int q) 
	{
		boolean found = false;

		for (int i = p; i <= q; i++)
		{
			long sq = (long) i * i;   // square the number
			int d = String.valueOf(i).length(); // number of digits in i

			long divisor = (long) Math.pow(10, d); // 10^d
			long right = sq % divisor;   // last d digits
			long left = sq / divisor;    // remaining digits

			if (left + right == i) 
			{
				System.out.print(i + " ");
				found = true;
			}
		}

		if (!found) 
		{
			System.out.print("INVALID RANGE");
		}
	}
	public static void main(String[] args) 
	{
		kaprekarNumbers(1,100);
	}

}
