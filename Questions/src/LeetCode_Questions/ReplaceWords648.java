package LeetCode_Questions;

// Leetcode:- 648. Replace Words

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReplaceWords648 
{
	public static String replaceWords(List<String> dictionary, String sentence) 
	{
		Collections.sort(dictionary, (a, b) -> a.length() - b.length());
		String[] str=sentence.split(" ");
		String[] list = dictionary.toArray(new String[0]);

		String result="";
		for(int i=0;i<str.length;i++)
		{
			int count=0;
			for(int j=0;j<list.length;j++)
			{
				if(str[i].startsWith(list[j]))
				{
					result+=list[j]+" ";
					count++;
					break;
				}
			}
			if(count==0) 
			{
				result+=str[i]+" ";
			}
		}
		return result.trim();
	}
	public static void main(String[] args)
	{
		List<String> dictionary=Arrays.asList("cat","bat","rat");
		String sentence="the cattle was rattled by the battery";
		System.out.println(replaceWords(dictionary, sentence));  // the cat was rat by the bat

		List<String> dictionary2=Arrays.asList("a","b","c");
		String sentence2="aadsfasf absbs bbab cadsfafs";
		System.out.println(replaceWords(dictionary2, sentence2));  //  a a b c



	}

}
