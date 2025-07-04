package CompanyQuestions;

import java.util.Stack;

public class MinAddToMakeParenthesisValid
{
	public static int minAddToMakeParenthesisValid(String str)
	{
		Stack<Character> stack=new Stack<>();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==')')
			{
				if(!stack.isEmpty() && stack.peek()=='(')
				{
					stack.pop();
				}
				else
				{
					stack.push(ch[i]);
				}
			}
			else
			{
				stack.push(ch[i]);
			}
		}
		return stack.size();
	}
	public static void main(String[] args)
	{
		String str="(()(";
		System.out.println(minAddToMakeParenthesisValid(str));
	}

}
