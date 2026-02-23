package LeetCode_Questions;

// Leetcode:- 686. Repeated String Match

public class RepeatedStringMatch686 
{
	public static int repeatedStringMatch(String a, String b)
	{
		String s1=a;
		int count=1;

		while(s1.length()<b.length())
		{
			s1+=a;
			count++;
		}
		if(s1.contains(b)) return count;

		s1+=a;
		count++;

		if(s1.contains(b)) return count;

		return -1;

	}
	public static void main(String[] args) 
	{
		System.out.println(repeatedStringMatch("abcd","cdabcdab"));  // 3
		System.out.println(repeatedStringMatch("a","aa"));  // 2
	}
}
