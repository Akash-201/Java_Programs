package LeetCode_Questions;

// Leetcode:- 806. Number of Lines To Write String

import java.util.Arrays;

public class NumberOfLinesToWriteString806 
{
	public static int[] numberOfLines(int[] widths, String s) 
	{
		int lines = 1;
		int currentWidth = 0;

		for (char c : s.toCharArray())
		{
			currentWidth += widths[c - 'a'];
			if (currentWidth > 100) 
			{
				lines++;
				currentWidth = widths[c - 'a'];  
			}
		}
		return new int[]{lines, currentWidth};
	}
	public static void main(String[] args) {
		int[] widths= {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,
				10,10,10,10,10,10,10,10,10};
		System.out.println(Arrays.toString(numberOfLines(widths,"abcdefghijklmnopqrstuvwxyz")));  // [3,60]

		int[] widths2= {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,
				10,10,10,10,10,10,10,10,10};
		System.out.println(Arrays.toString(numberOfLines(widths2,"bbbcccdddaaa"))); // [2,4]

	}
}
