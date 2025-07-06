package CompanyQuestions;

//Leecode 20. Valid Parentheses

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
