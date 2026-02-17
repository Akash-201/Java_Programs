package InterviewerAsked;

import java.util.Arrays;

public class Anagram
{
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length()) return false;

		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String s3=Arrays.toString(ch1);
		String s4=Arrays.toString(ch2);

		return s3.equals(s4);
	}
	public static void main(String[] args)
	{
		System.out.println(isAnagram("abcde","cadbe"));  // true
		System.out.println(isAnagram("rat","car"));  // false

	}

}
