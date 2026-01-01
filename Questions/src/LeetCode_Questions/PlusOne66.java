package LeetCode_Questions;

// // LeetCode :- 66. Plus One

import java.util.Arrays;

public class PlusOne66 
{
	public static int[] plusOne(int[] digits)
	{
		int n=digits.length;
		for(int i=n-1;i>=0;i--)
		{
			if(digits[i]!=9)
			{
				digits[i]++;
				return digits;
			}
			else
			{
				digits[i]=0;
			}
		}

		int[] result=new int[n+1];
		result[0]=1;
		return result;
	}

	public static void main(String[] args) 
	{
		int[] digits= {1,2,3};
		System.out.println(Arrays.toString(plusOne(digits)));  // [1,2,4]

		int[] digits2= {4,3,2,1};
		System.out.println(Arrays.toString(plusOne(digits2)));  // [4,3,2,2]

		int[] digits3= {9};
		System.out.println(Arrays.toString(plusOne(digits3)));  // [1,0]

		int[] digits4= {9,9,9};
		System.out.println(Arrays.toString(plusOne(digits4)));  // [1,0,0,0]

	}

}
