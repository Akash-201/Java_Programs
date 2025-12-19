package Alphabet;

public class WPattern 
{
	public static void printW_Pattern(int r, int c)
	{
		for (int i = 1; i <= r; i++)
		{
			for (int j = 1; j <= c; j++)
			{
				if (j == 1 || j == c)
				{
					System.out.print("*");
				}
				else if (i > r / 2 && j == i) 
				{
					System.out.print("*");
				}
				else if (i > r / 2 && j == (c - i + 1)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		printW_Pattern(7, 7);
	}
}
