package LeetCode_Questions;

// Leetcode:- 345. Reverse Vowels of a String

public class ReverseVowelsOf_A_String345 
{
	public static String reverseVowels(String s)
	{
		char[] ch=s.toCharArray();
		int start=0;
		int end=ch.length-1;

		while(start<end)
		{
			if(!(isVowel(ch[start])))
			{
				start++;
			}
			else if(!(isVowel(ch[end])))
			{
				end--;
			}
			else
			{
				char temp=ch[end];
				ch[end]=ch[start];
				ch[start]=temp;
				start++;
				end--;
			}
		}
		return String.valueOf(ch);
	}
	public static boolean isVowel(char ch)
	{
		if(ch=='a' || ch=='e' ||  ch=='i' ||  ch=='o' ||  ch=='u' || 
				ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			return true;

		}
		return false;
	}
	public static void main(String[] args)
	{
		System.out.println(reverseVowels("IceCreAm")); // AceCreIm
		System.out.println(reverseVowels("leetcode")); // leotcede

	}

}
