package LeetCode_Questions;
//  Leetcode:- 389. Find the Difference

import java.util.Arrays;

public class FindTheDifference389
{
	public static char findTheDifference(String s, String t) 
	{
		char[] ch1=s.toCharArray();
		char[] ch2=t.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				return ch2[i];
			}
		}
		return ch2[ch2.length-1];
	}
	public static void main(String[] args) 
	{
		System.out.println(findTheDifference("abcd","abcde"));  // e
		System.out.println(findTheDifference("","y"));  // y

	}

}
