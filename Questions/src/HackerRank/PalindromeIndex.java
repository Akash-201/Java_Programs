package HackerRank;

public class PalindromeIndex 
{
	public static int palindromeIndex(String s) 
	{

		int left = 0;
		int right = s.length() - 1;

		while (left < right)
		{
			if (s.charAt(left) == s.charAt(right)) 
			{
				left++;
				right--;
			} 
			else 
			{
				if (isPalindrome(s, left + 1, right))
					return left;
				else if (isPalindrome(s, left, right - 1))
					return right;
				else
					return -1;
			}
		}

		return -1;
	}

	private static boolean isPalindrome(String s, int i, int j) 
	{
		while (i < j) 
		{
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;

	}
	public static void main(String[] args) 
	{
		System.out.println(palindromeIndex("aaab"));  // 3
		System.out.println(palindromeIndex("baa"));  // 0
		System.out.println(palindromeIndex("aaa"));  // -1
		
	}
}
