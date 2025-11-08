package HackerRank;

import java.util.HashSet;
import java.util.Set;

public class StringConstruction 
{
	public static int stringConstruction(String s)
	{
		Set<Character> set = new HashSet<>();

		for (char c : s.toCharArray())
		{
			set.add(c);
		}

		return set.size();

	}
	public static void main(String[] args) 
	{
		System.out.println(stringConstruction("abcd"));  // 4
		System.out.println(stringConstruction("abab"));  // 2

	}

}
