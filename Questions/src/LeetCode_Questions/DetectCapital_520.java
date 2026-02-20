package LeetCode_Questions;

// Leetcode:- 520. Detect Capital

public class DetectCapital_520 
{
	public static boolean detectCapitalUse(String word)
	{
		int capitalCount=0;

		for(int i=0;i<word.length();i++)
		{
			if(Character.isUpperCase(word.charAt(i)))
				capitalCount++;
		}

		if(capitalCount==0) return true;
		else if(capitalCount==word.length()) return true;
		else if(capitalCount==1 && Character.isUpperCase(word.charAt(0))) return true;

		return false;
	}
	public static void main(String[] args)
	{
		System.out.println(detectCapitalUse("USA"));  // true
		System.out.println(detectCapitalUse("FlaG"));  // false 
	}
}

