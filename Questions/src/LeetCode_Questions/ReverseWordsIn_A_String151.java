package LeetCode_Questions;

// Leetcode: 151. Reverse Words in a String

public class ReverseWordsIn_A_String151 
{
	public static String reverseWords(String s) 
	{
		String[] str=s.split("\\s+");
		StringBuilder sb=new StringBuilder();
		for(int i=str.length-1;i>=0;i--)
		{
			sb.append(str[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}
	public static void main(String[] args) 
	{
		System.out.println(reverseWords("the sky is blue"));  // blue is sky the
		System.out.println(reverseWords("  hello world  "));  // world hello
		System.out.println(reverseWords("a good   example"));  // example good a
	}	

}
