package CompanyQuestions;

public class FirstCharacterCapital
{
	public static void convertFirstCharacterCapital(String s1)
	{
	
		String[] s2=s1.split(" ");
		String str="";
		
		for(int i=0;i<s2.length;i++)
		{
			String word=s2[i];
			if(word.length() > 0)
			{
				String firstCharacter=word.substring(0,1).toUpperCase();
				String remainingSame=word.substring(1).toLowerCase();
				str=str+firstCharacter+remainingSame+" ";
			}
		}
		str=str.trim(); // remove extra space
		System.out.println("Original String: "+s1);
		System.out.println("After Capitalize First Letter: "+str);
		
	}
	public static void main(String[] args)
	{
		String s1="this is java";
		convertFirstCharacterCapital(s1);
	}

}
