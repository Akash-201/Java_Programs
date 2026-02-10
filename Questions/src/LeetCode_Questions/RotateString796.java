package LeetCode_Questions;

// Leetcode:- 796. Rotate String

public class RotateString796 
{
	public static boolean rotateString(String s, String goal) 
	{
		if(s.length()!=goal.length()) return false;
		String result=s.concat(s);
		return result.contains(goal);
	}
	public static void main(String[] args) 
	{
		System.out.println(rotateString("abcde","cdeab"));  // true
		System.out.println(rotateString("abcde","abced"));  // false
	}

}
