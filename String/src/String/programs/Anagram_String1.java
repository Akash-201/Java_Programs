package String.programs;

// without special method 

import java.util.Arrays;

public class Anagram_String1 
{
	public static boolean checkAnagram(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		
		
		// convert String to char Array
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		// sort Array
		sortArray(ch1);
		sortArray(ch2);
		
//		return Arrays.equals(ch1, ch2);
		
		
		
		// convert array to string
		s1=new String(ch1);
		s2=new String(ch2);
		
		return s1.equals(s2);
		
				
	}
	
	public static void sortArray(char[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				}
				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		String s1="abhc";
		String s2="bcah";
		
		System.out.println(checkAnagram(s1, s2));
		
	}
	
	

}
