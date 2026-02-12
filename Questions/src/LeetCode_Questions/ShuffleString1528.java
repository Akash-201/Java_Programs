package LeetCode_Questions;

// leetcode:- 1528. Shuffle String

public class ShuffleString1528 
{
	public static  String restoreString(String s, int[] indices)
	{
		char[] arr=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[indices[i]]=s.charAt(i);

		}
		return String.valueOf(arr);
	}
	public static void main(String[] args) 
	{
		int[] indices= {4,5,6,7,0,2,1,3};
		System.out.println(restoreString("codeleet", indices));  // leetcode

		int[] indices2= {0,1,2};
		System.out.println(restoreString("abc", indices2));  // abc

	}

}
