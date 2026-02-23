package LeetCode_Questions;
// Leetcode:- 557. Reverse Words in a String III

public class ReverseWords_In_A_String_III_557 
{
	public static String reverseWords(String s) 
	{
		String[] arr=s.split(" ");
		String reverse="";
		for(int i=0;i<arr.length;i++)
		{
			String word=arr[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord+=word.charAt(j);
			}
			reverse+=reverseWord+" ";
		}
		return reverse.trim();
	}
	public static void main(String[] args) 
	{
		System.out.println(reverseWords("Let's take LeetCode contest"));  // s'teL ekat edoCteeL tsetnoc
		System.out.println(reverseWords("Mr Ding"));  // rM gniD

	}

}
