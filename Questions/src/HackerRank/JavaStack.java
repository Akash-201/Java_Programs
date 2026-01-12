package HackerRank;

import java.util.*;

class JavaStack 
{

	public static boolean checkBalanceParentheses(String str)
	{

		Stack<Character> s = new Stack<>();
		char[] strArr = str.toCharArray();

		for (int i = 0; i < strArr.length; i++) 
		{

			char ch = strArr[i];

			if (ch == '(' || ch == '{' || ch == '[') 
			{
				s.push(ch);
			} 
			else
			{

				if (s.isEmpty())
					return false;

				char top = s.pop();

				if ((ch == ')' && top != '(') ||
						(ch == '}' && top != '{') ||
						(ch == ']' && top != '[')) 
				{
					return false;
				}
			}
		}
		return s.isEmpty();
	}
	public static void main(String[] argh)
	{
		System.out.println(checkBalanceParentheses("{}()"));  // true
		System.out.println(checkBalanceParentheses("({()})")); // true
		System.out.println(checkBalanceParentheses("{}(")); // false
		System.out.println(checkBalanceParentheses("[]"));  // true
	}
}



