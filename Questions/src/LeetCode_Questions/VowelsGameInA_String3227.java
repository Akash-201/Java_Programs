package LeetCode_Questions;

// Leetcode: 3227. Vowels Game in a String

public class VowelsGameInA_String3227 
{
	public static boolean doesAliceWin(String s) 
	{
		for(int i=0;i<s.length();i++)
		{
			char c =s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' )
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		String s="leetcoder";
		String s2="bbcd";
		System.out.println(doesAliceWin(s));  // true
		System.out.println(doesAliceWin(s2)); // false
	}
}
