package String;
// if contain only a string without any special character and number 

public class CountVowelAndConsonant
{
	public static void countVowelAndConsonant(String str)
	{
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		int vowel=0;
		int consonant=0;
		for(int i=0;i<ch.length;i++)
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
		System.out.println("Total Vowel Is: "+vowel);
		System.out.println("Total Consonsnt Is: "+consonant);
	
	}
	public static void main(String[] args)
	{
		countVowelAndConsonant("Hello");
	}

}
