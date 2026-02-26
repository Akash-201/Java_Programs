package LeetCode_Questions;

// Leetcode:- 771. Jewels and Stones

public class JewelsAndStones771 
{
	public static int numJewelsInStones(String jewels, String stones) 
	{
		char[] ch1=jewels.toCharArray();
		char[] ch2=stones.toCharArray();
		int count=0;
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
					count++;
			}
		}
		return count;

	}
	public static void main(String[] args) 
	{
		System.out.println(numJewelsInStones("aA","aAAbbb"));  // 3
		System.out.println(numJewelsInStones("z","ZZ"));  // 0
	}
}