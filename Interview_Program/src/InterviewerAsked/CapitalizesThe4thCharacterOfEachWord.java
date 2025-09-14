package InterviewerAsked;

/*
Write a Java program that takes a sentence as input and capitalizes the 4th character of each word in that sentence.

For example:

Input:
this is a sample sentence

Output:
thiS is a samPle senTence

Explanation:

In "this", the 4th character 's' is capitalized → "thiS"

In "sample", the 4th character 'p' is capitalized → "samPle"

In "sentence", the 4th character 't' is capitalized → "senTence"

Words with less than 4 characters (like "is", "a") remain unchanged.
 */

public class CapitalizesThe4thCharacterOfEachWord 
{
	public static void capitalizeWord(String str)
	{
		String[] words=str.split(" ");
		String result="";
		for(int i=0;i<words.length;i++)
		{
			if(words[i].length()>=4)
			{
				char fourthCharacter=Character.toUpperCase(words[i].charAt(3));
				String newWord=words[i].substring(0,3)+fourthCharacter+words[i].substring(4);
				result=result.concat(newWord+" ");
			}
			else 
			{
				result=result.concat(words[i]+" ");
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		String str="this is a sample sentence";
		capitalizeWord(str);
		
	}

}
