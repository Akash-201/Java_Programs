package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Gemstones 
{
	public static int gemstones(List<String> arr) 
	{

		Set<Character> common = new HashSet<>();
		for (char c : arr.get(0).toCharArray()) 
		{
			common.add(c);
		}

		// For each next rock, retain only the common elements
		for (int i = 1; i < arr.size(); i++) 
		{
			Set<Character> current = new HashSet<>();
			for (char c : arr.get(i).toCharArray()) 
			{
				current.add(c);
			}
			common.retainAll(current);
		}

		// The remaining characters are gemstones
		return common.size();

	}
	
	public static void main(String[] args) 
	{
		List<String> arr=Arrays.asList("abcdde","baccd","eeabg");
		System.out.println(gemstones(arr)); // 2
		
	}

}
