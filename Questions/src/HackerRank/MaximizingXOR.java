package HackerRank;

public class MaximizingXOR
{
	public static int maximizingXor(int l, int r) 
	{
		int x = l ^ r;
		int msb = 0;
		while (x > 0) 
		{
			msb++;
			x >>= 1;
		}

		return (1 << msb) - 1;
	}
	public static void main(String[] args) 
	{
		System.out.println(maximizingXor(10,15));
	}

}
