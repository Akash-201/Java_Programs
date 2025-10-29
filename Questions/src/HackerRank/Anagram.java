package HackerRank;

public class Anagram 
{
	public static int anagram(String s) 
	{
		if (s.length() % 2 != 0)
		{
			return -1;
		}

		int mid = s.length() / 2;
		String s1 = s.substring(0, mid);
		String s2 = s.substring(mid);

		int[] freq = new int[26];


		for (char c : s1.toCharArray()) 
		{
			freq[c - 'a']++;
		}


		for (char c : s2.toCharArray()) 
		{
			freq[c - 'a']--;
		}


		int changes = 0;
		for (int val : freq)
		{
			if (val > 0)
				changes += val;
		}

		return changes;
	}

	public static void main(String[] args)
	{
		System.out.println(anagram("aaabbb")); // 3
		System.out.println(anagram("ab")); // 1
		System.out.println(anagram("abc")); // -1

	}
}
