package String.programs;

//Write a Java program to reverse each word of a given string.
//For example, If “Java Concept Of The Day” is input string then output should be “avaJ tpecnoC fO ehT yaD”.

public class Reverse_Each_Word 
{
	public static void reverse(String s1)
	{
		String[] s2=s1.split(" ");
		String reverseString="";
		
		for(int i=0;i<s2.length;i++)
		{
			String word=s2[i];
			String reverseWord="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord+=word.charAt(j);
			}
			
			reverseString=reverseString+reverseWord+" ";
			
		}
		System.out.println(s1);
		System.out.println(reverseString);
	}
	
	public static void main(String[] args) {
		String s1="Java Concept Is Easy";
		reverse(s1);
	}

}
