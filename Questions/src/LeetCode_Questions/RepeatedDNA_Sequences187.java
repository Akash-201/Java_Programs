package LeetCode_Questions;

// Leetcode:- 187. Repeated DNA Sequences

import java.util.*;

public class RepeatedDNA_Sequences187 
{
	public static List<String> findRepeatedDnaSequences(String s) 
	{
		HashSet<String> seen=new HashSet<>();
		HashSet<String> duplicate=new HashSet<>();

		for(int i=0;i+9<s.length();i++)
		{
			String temp=s.substring(i,i+10);
			if(seen.contains(temp))
			{
				duplicate.add(temp);
			}

			seen.add(temp);
		}
		return new ArrayList<>(duplicate);
	}
	public static void main(String[] args) 
	{
		System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));  //  [AAAAACCCCC, CCCCCAAAAA]
		System.out.println(findRepeatedDnaSequences("AAAAAAAAAAAAA"));  //  [AAAAAAAAAA]
	}
}
