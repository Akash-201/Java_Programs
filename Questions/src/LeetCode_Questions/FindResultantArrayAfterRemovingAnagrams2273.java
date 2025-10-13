package LeetCode_Questions;

// LeetCode: 2273. Find Resultant Array After Removing Anagrams

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams2273 
{
	public static List<String> removeAnagrams(String[] words)
	{
		int curr = 1;
		int prev = 0;
		List<String> result = new ArrayList<>();
		result.add(words[0]);

		while (curr < words.length) 
		{
			if (!isAnagram(words[curr], words[prev]))
			{
				result.add(words[curr]);
				prev = curr;
			}

			curr += 1;
		}

		return result;
	} 

	private static boolean isAnagram(String w1, String w2) 
	{
		char[] a = w1.toCharArray();
		char[] b = w2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		return Arrays.equals(a, b);
	}
	public static void main(String[] args)
	{
		String[] words={"abba","baba","bbaa","cd","cd"};
		System.out.println(removeAnagrams(words));
		
		String[] words2={"a","b","c","d","e"};  //  [abba, cd]
		System.out.println(removeAnagrams(words2));  // [a, b, c, d, e]
		
	}

}
