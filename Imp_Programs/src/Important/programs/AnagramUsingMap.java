package Important.programs;

import java.util.HashMap;

public class AnagramUsingMap 
{
	public static HashMap<Character,Integer> makeFreqMap(String str)
	{
		HashMap<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(! mp.containsKey(ch))
			{
				mp.put(ch,1);
			}
			else
			{
				int currentFreq=mp.get(ch);
				mp.put(ch,currentFreq+1);
			}
		}
		return mp;
	}

	public static boolean checkAnagram(String s, String t)
	{
		if(s.length()!=t.length()) return false;
		HashMap<Character,Integer> mp1=makeFreqMap(s);
		HashMap<Character,Integer> mp2=makeFreqMap(t);

		return mp1.equals(mp2);

	}
	public static void main(String[] args) 
	{
		System.out.println(checkAnagram("listen","silent"));  // true
		System.out.println(checkAnagram("anagram","gram"));  // false

	}

}
