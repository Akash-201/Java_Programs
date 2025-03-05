package String;

//without any special method(without sort method) 

import java.util.Arrays;

public class AnagramString1
{
	public static boolean checkAnagram(String s1, String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();

		sortArray(ch1);
		sortArray(ch2);
		return Arrays.equals(ch1, ch2);


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
		String s2="bcaH";

		System.out.println(checkAnagram(s1, s2));

	}

}
