package HackerRank;

public class RepeatedString 
{
	public static long repeatedString(String s, long n) 
	{
		long countInS = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == 'a')
			{
				countInS++;
			}
		}

		//  how many times the string repeats fully
		long fullRepeats = n / s.length();

		//  how many characters left after full repeats
		long remainder = n % s.length();

		//  count 'a' in the leftover part
		long countInRemainder = 0;
		for (int i = 0; i < remainder; i++)
		{
			if (s.charAt(i) == 'a') 
			{
				countInRemainder++;
			}
		}
		// total
		return (fullRepeats * countInS) + countInRemainder;
	}
	public static void main(String[] args) 
	{
		System.out.println(repeatedString("aba",10));    // 7
		System.out.println(repeatedString("abcac",10));  // 4
		
		
	}

}
