package LeetCode_Questions;

// Leetcode:- 720. Longest Word in Dictionary

import java.util.*;

public class LongestWordInDictionary720 
{
	public static String longestWord(String[] words) 
	{
		Arrays.sort(words);
		HashSet<String> set=new HashSet<>();
		String result="";
		for(String w: words)
		{
			if(w.length()==1 || set.contains(w.substring(0,w.length()-1)))
			{
				if(w.length()> result.length()) 
				{
					result=w;
				}
				set.add(w);
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{
		String words[]= {"w","wo","wor","worl","world"};
		System.out.println(longestWord(words));  // world

		String words2[]= {"a","banana","app","appl","ap","apply","apple"};
		System.out.println(longestWord(words2));  // apple
	}

}
