package HackerRank;

import java.util.Stack;

public class SuperReducedString
{


	public static String superReducedString(String s)
	{
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray())
		{
			if (!stack.isEmpty() && stack.peek() == c) 
			{
				stack.pop(); // remove the pair
			} 
			else 
			{
				stack.push(c); // add character
			}
		}

		if (stack.isEmpty()) 
		{
			return "Empty String";

		}
		
		StringBuilder result = new StringBuilder();
		for (char ch : stack) 
		{
			result.append(ch);
		}

		return result.toString();
	}
	public static void main(String[] args)
	{
		
		System.out.println(superReducedString("aaabccddd"));  // abd
		System.out.println(superReducedString("aa"));  // Empty String
		System.out.println(superReducedString("baab"));  // Empty String
	}

}
