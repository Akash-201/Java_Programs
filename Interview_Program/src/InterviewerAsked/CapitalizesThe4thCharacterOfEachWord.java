package InterviewerAsked;

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
