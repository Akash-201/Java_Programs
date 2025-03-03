package String;

public class CountVowelAndConsonant2 
{
	public static void countVowelAndConsonant(String str)
	{
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		int vowel=0;
		int consonant=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' )
				{
					vowel++;
				}
				else 
				{
					consonant++;
				}
			}
		}
	     System.out.println("Total Vowels: " + vowel);
	        System.out.println("Total Consonants: " + consonant);
		
	}
	public static void main(String[] args)
	{
		countVowelAndConsonant("Hello World");
	}

}
