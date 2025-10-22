package HackerRank;

public class AlternatingCharacters 
{
	public static int alternatingCharacters(String s) 
	{
		int deletions = 0;

		for (int i = 1; i < s.length(); i++) 
		{
			if (s.charAt(i) == s.charAt(i - 1)) 
			{
				deletions++;
			}
		}

		return deletions;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(alternatingCharacters("AAAA"));  // 3
		System.out.println(alternatingCharacters("BBBBB"));  // 4
		System.out.println(alternatingCharacters("ABABABAB"));  // 0
		System.out.println(alternatingCharacters("BABABA"));  // 0
		System.out.println(alternatingCharacters("AAABBB"));  // 4
		
	}

}
