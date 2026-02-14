package LeetCode_Questions;

// Leetcode:- 392. Is Subsequence

public class IsSubsequence392
{
	public static boolean isSubsequence(String s, String t)
	{
		if(s.length()==0) return true;

		int i=0, j=0;
		while(i<s.length() && j<t.length())
		{
			if(s.charAt(i)==t.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		if(i==s.length()) return true;

		return false; 
	}
	public static void main(String[] args) 
	{
		System.out.println(isSubsequence("abc","ahbgdc")); // true
		System.out.println(isSubsequence("axc","ahbgdc")); // false

	}

}
