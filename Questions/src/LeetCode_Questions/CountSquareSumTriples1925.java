package LeetCode_Questions;

import java.util.HashSet;
import java.util.Set;

public class CountSquareSumTriples1925 
{
	public static int countTriples(int n)
	{
		Set<Integer> set = new HashSet<>();

		for (int c = 1; c <= n; c++) 
		{
			set.add(c * c);
		}

		int count = 0;
		for (int a = 1; a <= n; a++) 
		{
			for (int b = 1; b <= n; b++)
			{
				if (set.contains(a * a + b * b)) 
				{
					count += 1;
				}
			}
		}

		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(countTriples(5));  // 2
		System.out.println(countTriples(10));  // 4
	}

}
