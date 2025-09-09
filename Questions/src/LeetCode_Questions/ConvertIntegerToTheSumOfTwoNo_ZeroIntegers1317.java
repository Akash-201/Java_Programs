package LeetCode_Questions;

// Leetcode: 1317. Convert Integer to the Sum of Two No-Zero Integers

import java.util.Arrays;

public class ConvertIntegerToTheSumOfTwoNo_ZeroIntegers1317
{
	public static int[] getNoZeroIntegers(int n)
	{
		for(int a=1;a<n;a++)
		{
			int b=n-a;
			if(!isContainsZero(a) && !isContainsZero(b))
			{
				return new int[]{a,b};
			}

		}
		return new int[2];
	}
	private static boolean isContainsZero(int n)
	{
		while(n>0)
		{
			if(n%10==0)
			{
				return true;
			}
			n=n/10;
		}
		return false;
	}
	public static void main(String[] args) 
	{

		System.out.println(Arrays.toString(getNoZeroIntegers(11)));  // [2, 9]
		System.out.println(Arrays.toString(getNoZeroIntegers(2)));  // [1, 1]

	}


}
