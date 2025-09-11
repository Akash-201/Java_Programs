package LeetCode_Questions;

import java.util.Arrays;

public class SortVowelsInA_String2785 
{
	private static boolean isVowel(char ch) 
	{

		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
				|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' );
	}

	public static String sortVowels(String s)
	{
		StringBuilder temp = new StringBuilder();
		for (char ch : s.toCharArray())
		{
			if (isVowel(ch)) 
			{
				temp.append(ch);
			}
		}

		char[] tempArray = temp.toString().toCharArray();
		Arrays.sort(tempArray);

		int j = 0;
		char[] resultArray = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (isVowel(s.charAt(i))) {
				resultArray[i] = tempArray[j];
				j++;
			}
		}

		return new String(resultArray);
	}
	public static void main(String[] args) {
		String s="lEetcOde";
		System.out.println(sortVowels(s));
	}

}
