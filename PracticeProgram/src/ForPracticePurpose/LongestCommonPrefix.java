package ForPracticePurpose;

import java.util.Arrays;

//Input: arr[] = ["apple", "ape", "april"]
//Output : "p"
//Explanation: "ap" is the longest common prefix in all the given strings: "apple", "ape", "april".

public class LongestCommonPrefix
{
	public static String longestCommonPrefix(String[] arr)
	{
		Arrays.sort(arr);
		
		String first=arr[0];
		String last=arr[arr.length-1];
		int minimumLength = Math.min(first.length(),last.length());
		
		int i=0;
		
		while(i < minimumLength && first.charAt(i)==last.charAt(i))
		{
			i++;
		}
		return first.substring(0,i);
		
		
	}
	public static void main(String[] args)
	{
		String[] arr = {"hello", "world"};
		System.out.println(longestCommonPrefix(arr));
		
	}

}
