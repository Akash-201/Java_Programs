package HackerRank;

public class Encryption
{
	public static String encryption(String s) 
	{
		s = s.replaceAll(" ", "");

		int L = s.length();
		int rows = (int) Math.floor(Math.sqrt(L));
		int cols = (int) Math.ceil(Math.sqrt(L));

		if (rows * cols < L) 
		{
			rows++;
		}

		StringBuilder result = new StringBuilder();

		for (int col = 0; col < cols; col++) 
		{
			for (int row = 0; row < rows; row++) 
			{
				int index = row * cols + col;
				if (index < L)
				{
					result.append(s.charAt(index));
				}
			}
			result.append(" ");
		}

		return result.toString().trim();

	}
	public static void main(String[] args)
	{
		System.out.println(encryption("haveaniceday"));
	}
}

