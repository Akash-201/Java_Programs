package LeetCode_Questions;

/* LeetCode: 1614. Maximum Nesting Depth of the Parentheses
Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1:

Input: s = "(1+(2*3)+((8)/4))+1"
Output: 3

Explanation:
Digit 8 is inside of 3 nested parentheses in the string.

Example 2:
Input: s = "(1)+((2))+(((3)))"
Output: 3

Explanation:
Digit 3 is inside of 3 nested parentheses in the string.

Example 3:
Input: s = "()(())((()()))"
Output: 3

Constraints:

1 <= s.length <= 100
s consists of digits 0-9 and characters '+', '-', '*', '/', '(', and ')'.
It is guaranteed that parentheses expression s is a VPS.

 */

public class MaximumNestingDepthOfTheParentheses1614 
{
	public static int maxDepth(String s) 
	{
		int max=0;
		int currentOpeningBracket=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='(')
			{
				currentOpeningBracket++;
				max=Math.max(max, currentOpeningBracket);
			}
			if(s.charAt(i)==')')
			{
				currentOpeningBracket--;
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		String s="(1)+((2))+(((3)))";
		String s2="()(())((()()))";
		String s3= "(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(s));
		System.out.println(maxDepth(s2));
		System.out.println(maxDepth(s3));
	}


}
