package LeetCode_Questions;
// Leetcode:- 125. Valid Palindrome

public class ValidPalindrome125 
{
	public static boolean isPalindrome(String s) 
	{
		if(s.length()==0) return true;

		String str=s.toLowerCase();
		str=str.replaceAll("[^a-zA-Z0-9]","");
		int start=0;
		int end=str.length()-1;
		while(start<end)
		{
			if (str.charAt(start) != str.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));  // true
		System.out.println(isPalindrome("race a car"));  // false
		System.out.println(isPalindrome(" "));  // true
	}
}
