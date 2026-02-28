package LeetCode_Questions;
// Leetcode:- 71. Simplify Path

import java.util.Stack;

public class SimplifyPath71 
{
	public static String simplifyPath(String path) 
	{
		Stack<String> stack = new Stack<>();
		String[] str = path.split("/");

		for (String num : str)
		{
			if (num.equals("") || num.equals("."))  
				continue;

			if (num.equals(".."))
			{
				if (!stack.isEmpty())
				{
					stack.pop();
				}
			}
			else
			{
				stack.push(num);   
			}
		}

		StringBuilder sb = new StringBuilder();

		for (String st : stack)
		{
			sb.append("/").append(st);
		}

		return sb.length() == 0 ? "/" : sb.toString();
	}
	public static void main(String[] args) 
	{
		System.out.println(simplifyPath("/home/"));  //  /home
		System.out.println(simplifyPath("/home//foo/")); //  /home/foo
		System.out.println(simplifyPath("/home/user/Documents/../Pictures"));  //  /home/user/Pictures
		System.out.println(simplifyPath( "/../"));  //  /
		System.out.println(simplifyPath("/.../a/../b/c/../d/./"));  //  /.../b/d
	}
}
