package LeetCode_Questions;

// Leetcode:- 205. Isomorphic Strings

import java.util.HashMap;

public class IsomorphicStrings205 
{
	public static boolean isIsomorphic(String s, String t) 
	{
		HashMap<Character,Character> mp=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			Character sCh=s.charAt(i);
			Character tCh=t.charAt(i);

			if(mp.containsKey(sCh))
			{
				if(mp.get(sCh)!=tCh) return false;
			}
			else if(mp.containsValue(tCh))
			{
				return false;
			}
			else
			{
				mp.put(sCh,tCh);
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		System.out.println(isIsomorphic("egg","add"));  // true
		System.out.println(isIsomorphic("f11","b23"));  // false
		System.out.println(isIsomorphic("paper","title"));  // true
	}
}
