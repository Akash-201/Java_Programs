package LeetCode_Questions;

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
		int n=11;
		System.out.println(Arrays.toString(getNoZeroIntegers(n)));

	}


}
