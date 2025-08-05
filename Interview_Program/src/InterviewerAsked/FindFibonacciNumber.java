package InterviewerAsked;

// Given an integer array, print only the numbers that are Fibonacci numbers. Ignore duplicates.

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindFibonacciNumber
{
	public static boolean checkFibonacciNumber(int num)
	{
		int a=0;
		int b=1;

		while(a<=num)
		{
			if(a==num)
				return true;

			int c=a+b;
			a=b;
			b=c;
		}
		return false;
	}
	public static int[] printFibonacciNumber(int[] arr)
	{
		Set<Integer> number=new LinkedHashSet<>();

		for(int num : arr)
		{
			if(checkFibonacciNumber(num))
			{
				number.add(num);
			}
		}
		int[] result=new int[number.size()];
		int i=0;
		for(int val : number)
		{
			result[i]=val;
			i++;
		}
		return result;
	}
	public static void main(String[] args)
	{
		int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 13, 21, 34, 55,58,60, 89,95, 100};
		
		// in Array 
		// System.out.println(Arrays.toString(printFibonacciNumber(arr)));
		
		
		// in simple 
		int[] res=printFibonacciNumber(arr);
		for(int num : res)
		{
			System.out.print(num+" ");
		}
		
	}

}
