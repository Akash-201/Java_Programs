package LeetCode_Questions;

//Leetcode:- 942. DI String Match

import java.util.Arrays;

public class DI_StringMatch942
{
	public static  int[] diStringMatch(String s) {
		int n=s.length();
		int[] arr=new int[n+1];
		int index=0;
		char low='I';
		char high='D';
		int start=0;
		int end=n;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==low)
			{
				arr[index]=start;
				start++;
			}
			else
			{
				arr[index]=end;
				end--;
			}
			index++;
		}
		arr[arr.length-1]=start++;
		return arr;
	}
	public static void main(String[] args)
	{
		System.out.println(Arrays.toString(diStringMatch("IDID")));  // [0, 4, 1, 3, 2]
		System.out.println(Arrays.toString(diStringMatch("III")));  // [0, 1, 2, 3]
		System.out.println(Arrays.toString(diStringMatch("DDi")));  // [3, 2, 1, 0]


	}

}
