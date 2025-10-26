package LeetCode_Questions;

// LeetCode: 3461. Check If Digits Are Equal in String After Operations I

public class CheckIfDigitsAreEqualInStringAfterOperationsI_3461 
{
	public static boolean hasSameDigits(String s) 
	{
		while (s.length() > 2) 
		{
			StringBuilder newString = new StringBuilder();
			for (int i = 0; i < s.length() - 1; i++) 
			{
				int a = s.charAt(i) - '0';
				int b = s.charAt(i + 1) - '0';
				newString.append((a + b) % 10);
			}

			s = newString.toString();
		}

		return s.length() == 2 && s.charAt(0) == s.charAt(1);
	}
	public static void main(String[] args)
	{
		System.out.println(hasSameDigits("3902"));  // true
		System.out.println(hasSameDigits("34789")); // false

	}

}
