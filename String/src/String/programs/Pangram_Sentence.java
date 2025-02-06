package String.programs;

//A pangram is a sentence containing every letter of the alphabet at least once.
//
//Example: Given the input string "The quick brown fox jumps over the lazy dog", the output should be true.

import java.util.HashSet;

public class Pangram_Sentence 
{
	public static boolean checkPangram(String s1)
	{
		String s2=s1.toLowerCase();
		HashSet<Character> set=new HashSet<>();
		
		for(int i=0;i<s2.length();i++)
		{
			char c=s2.charAt(i);
			if(c>='a' && c<='z'  )
			{
				
				set.add(c);
			}
		}
		
		return set.size()==26;
		
		
	}
	public static void main(String[] args) {
		String s1="The quick brown fox jumps over the lazy dog";
		System.out.println(checkPangram(s1));
	}

}
