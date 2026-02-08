package LeetCode_Questions;
// Leetcode:- 387. First Unique Character in a String

public class FirstUniqueCharacterInA_String387 
{
	public static int firstUniqChar(String s) 
	{
		int[] freq=new int[26];
		char[] ch=s.toCharArray();

		for(char c : ch)
		{
			freq[c-'a']++;
		}
		for(int i=0;i<ch.length;i++)
		{
			if(freq[ch[i]-'a']==1)
				return i;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		System.out.println(firstUniqChar("leetcode"));  // 0
		System.out.println(firstUniqChar("loveleetcode"));  // 2
		System.out.println(firstUniqChar("aabb"));  // -1

	}

}
