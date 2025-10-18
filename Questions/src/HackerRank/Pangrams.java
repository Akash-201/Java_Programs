package HackerRank;

import java.util.HashSet;
import java.util.Set;

public class Pangrams 
{
	public static String pangrams(String s) 
	{
		s = s.toLowerCase();
		Set<Character> letters = new HashSet<>();
		
		for (char c : s.toCharArray()) 
		{
			if (Character.isLetter(c))
			{
				letters.add(c);
			}
		}
		return (letters.size() == 26) ? "pangram" : "not pangram";
	}
	public static void main(String[] args)
	{
		String s="We promptly judged antique ivory buckles for the next prize";
		System.out.println(pangrams(s));  // pangram
		
		String s2="We promptly judged antique ivory buckles for the prize";
		System.out.println(pangrams(s2)); // not pangram
		
	}

}
