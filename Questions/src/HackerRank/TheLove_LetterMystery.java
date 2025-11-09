package HackerRank;

public class TheLove_LetterMystery 
{
	public static int theLoveLetterMystery(String s)
	{

		int operations = 0;
		int left = 0;
		int right = s.length() - 1;

		while (left < right) 
		{
			operations += Math.abs(s.charAt(left) - s.charAt(right));
			left++;
			right--;
		}

		return operations;
	}
	public static void main(String[] args)
	{
		System.out.println(theLoveLetterMystery("abc"));  // 2
		System.out.println(theLoveLetterMystery("abcba"));  // 0
		System.out.println(theLoveLetterMystery("abcd"));  // 4
		System.out.println(theLoveLetterMystery("cba"));  // 2
		
		
	}

}
