package LeetCode_Questions;

// Leetcode:-  242. Valid Anagram

import java.util.Arrays;

public class ValidAnagram242 
{
	public static boolean isAnagram(String s, String t)
	{
		if(s.length()!=t.length()) return false;

		char[] ch1=s.toCharArray();
		char[] ch2=t.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String s1=Arrays.toString(ch1);
		String s2=Arrays.toString(ch2);

		return s1.equals(s2);
	}
	public static void main(String[] args) 
	{
		System.out.println(isAnagram("anagram","nagaram"));  // true
		System.out.println(isAnagram("rat","car"));  // false
	}
}
