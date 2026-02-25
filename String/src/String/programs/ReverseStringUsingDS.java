package String.programs;

import java.util.Stack;

public class ReverseStringUsingDS
{
	public static String reverseString(String s)
	{
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			stack.push(s.charAt(i));
		}
		String reverse="";
		while(!stack.isEmpty())
		{
			reverse+=stack.pop();
		}
		return reverse;
	}
	public static void main(String[] args) 
	{
		System.out.println(reverseString("Follow"));
	}
}
