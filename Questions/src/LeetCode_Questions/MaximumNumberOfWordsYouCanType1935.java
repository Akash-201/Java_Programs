package LeetCode_Questions;

//  Leetcode: 1935. Maximum Number of Words You Can Type

public class MaximumNumberOfWordsYouCanType1935 
{
	public static int canBeTypedWords(String text, String brokenLetters)
	{
		String[] words = text.split(" ");

		int brokenWords = 0;
		for (String word : words)
		{
			for (char c : word.toCharArray())
			{
				if (brokenLetters.indexOf(c) != -1) 
				{
					brokenWords += 1;
					break;
				}
			}
		}

		return words.length - brokenWords;
	}

	public static void main(String[] args)
	{
		System.out.println(canBeTypedWords("Hello World", "ad"));  // 1
		System.out.println(canBeTypedWords("leet code", "lt"));    //1
		System.out.println(canBeTypedWords("leet code", "e"));     //0
	}

}
