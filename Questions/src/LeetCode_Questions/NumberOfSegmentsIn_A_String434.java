package LeetCode_Questions;
// Leetcode:- 434. Number of Segments in a String

public class NumberOfSegmentsIn_A_String434 
{
	public static int countSegments(String s) 
	{
		if(s.equals("")) return 0;
		int count=0;
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(str[i]!="")
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		System.out.println(countSegments("Hello, my name is John"));  // 5
		System.out.println(countSegments("Hello"));  // 1
		
	}

}
