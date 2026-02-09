package LeetCode_Questions;

// Leetcode:- 344. Reverse String

import java.util.Arrays;

public class ReverseString344
{
	public static void reverseString(char[] s)
	{
		int start=0;
		int end=s.length-1;
		while(start<end)
		{
			char ch=s[start];
			s[start]=s[end];
			s[end]=ch;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(s));
	}
	public static void main(String[] args)
	{
		char[] s= {'h','e','l','l','o'};
		reverseString(s);  // [o, l, l, e, h]

		char[] s2= {'H','a','n','n','a','h'};
		reverseString(s2);  // [h, a, n, n, a, H]
	}

}
