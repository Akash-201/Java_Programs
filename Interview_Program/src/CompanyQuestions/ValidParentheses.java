package CompanyQuestions;

/*     leetcode 20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.

*/

import java.util.Stack;

public class ValidParentheses 
{
	public static boolean isValid(String str)
	{
		Stack<Character> stack=new Stack<>();

		for(char ch : str.toCharArray())
		{
			if(ch=='(' || ch=='{' || ch=='[')
			{
				stack.push(ch);
			}
			else
			{
				if(stack.isEmpty())
					return false;

				char top=stack.pop();
				if  ((ch==')' && top!='(') || 
						(ch=='}' && top!='{') || 
						(ch==']' && top!='['))
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args)
	{
		String str="(]";  // false
		String str2="([])";  // true
		String str3="()[]{}"; // true
		String str4="()";   // true

		System.out.println(isValid(str));
		System.out.println(isValid(str2));
		System.out.println(isValid(str3));
		System.out.println(isValid(str4));
	}

}
