package LeetCode_Questions;

// Leetcode:- 521. Longest Uncommon Subsequence I

public class LongestUncommonSubsequence_I_521 
{
	public static int findLUSlength(String a, String b) 
	{
		if(a.equals(b)) return -1;

		return Math.max(a.length(),b.length());
	}

	public static void main(String[] args) 
	{
		System.out.println(findLUSlength("aaa","aaa"));  // -1
		System.out.println(findLUSlength("aba","cdc"));  // 3
		System.out.println(findLUSlength("aaa","bbb"));  // 3
	}
}
