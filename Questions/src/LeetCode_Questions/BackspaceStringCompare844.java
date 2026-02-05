package LeetCode_Questions;
//Leetcode:- 844. Backspace String Compare

import java.util.Stack;

public class BackspaceStringCompare844 
{
	public static boolean backspaceCompare(String s, String t) 
	{
		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();

		for(char c : s.toCharArray())
		{
			if(c=='#' && s1.size()>=1)
				s1.pop();
			else
			{

				if(c!='#')
					s1.push(c);
			}
		}

		String str1 = s1.toString();

		for(char c : t.toCharArray())
		{
			if(c=='#' && s2.size()>=1)
				s2.pop();
			else
			{

				if(c!='#')
					s2.push(c);
			}
		}

		String str2 = s2.toString();

		return str1.equals(str2);
	}
	public static void main(String[] args) 
	{
		System.out.println(backspaceCompare("ab#c","ad#c"));  // true
		System.out.println(backspaceCompare("ab##","c#d#"));  // true
		System.out.println(backspaceCompare("a#c","b"));  // false

	}

}
