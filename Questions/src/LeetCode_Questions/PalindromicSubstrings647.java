package LeetCode_Questions;

// Leetcode:- 647. Palindromic Substrings

public class PalindromicSubstrings647 
{
	public static int countSubstrings(String s) 
	{
		int count=s.length();
		for(int i=0;i<s.length()-1;i++)
		{
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(i));

			for(int j=i+1;j<s.length();j++)
			{
				sb.append(s.charAt(j));
				String result=sb.toString();
				if(checkPalindrome(result)) count++;
			}
		}
		return count;
	}
	private static boolean checkPalindrome(String str)
	{
		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
			if(str.charAt(left)!=str.charAt(right)) return false;

			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args)
	{
		System.out.println(countSubstrings("abc"));  // 3
		System.out.println(countSubstrings("aaa"));  // 6
	}

}
