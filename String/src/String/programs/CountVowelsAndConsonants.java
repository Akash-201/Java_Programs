package String.programs;

public class CountVowelsAndConsonants 
{
	public static void count(String str)
	{
		String convert=str.toUpperCase();
		int vowels=0;
		int consonants=0;
		char[] ch=convert.toCharArray();
		
		for(int i=0;i<=ch.length-1;i++)
		{
			if(ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		
		System.out.println("Total Vowels are:- "+vowels);
		System.out.println("Total Consonants are:- "+consonants);
		
	}
	
	public static void main(String[] args) {
		count("Hello");
	}

}
