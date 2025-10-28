package HackerRank;

public class FunnyString 
{
	public static String funnyString(String s)
	{

		int n = s.length();

		for (int i = 1; i < n; i++) {
			int diff1 = Math.abs(s.charAt(i) - s.charAt(i - 1));
			int diff2 = Math.abs(s.charAt(n - i) - s.charAt(n - i - 1));

			if (diff1 != diff2) 
			{
				return "Not Funny";
			}
		}

		return "Funny";
	}
	
	public static void main(String[] args) 
	{
		System.out.println(funnyString("acxz"));  // Funny
		System.out.println(funnyString("bcxz"));  // Not Funny
		
		
	}

}
