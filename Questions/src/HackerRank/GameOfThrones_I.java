package HackerRank;

public class GameOfThrones_I 
{
	public static String gameOfThrones(String s) 
	{
		int[] freq = new int[26];

		for (char c : s.toCharArray())
		{
			freq[c - 'a']++;
		}

		int oddCount = 0;

		for (int count : freq) 
		{
			if (count % 2 != 0) 
			{
				oddCount++;
			}
		}


		return (oddCount > 1) ? "NO" : "YES";

	}
	public static void main(String[] args) {
		System.out.println(gameOfThrones("aaabbbb")); // YES
		System.out.println(gameOfThrones("cdefghmnopqrstuvw")); // NO
	}


}
