package String.programs;

// convert first character in Capital and others in small

public class FirstCapitalOtherSmall
{
	public static void convert(String str)
	{
		String[] str2=str.split(" ");
		String result="";

		for(int i=0;i<str2.length;i++)
		{
			if(!str2[i].isEmpty())
			{
				String word=str2[i];
				String capitalizedWord=Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase()+" ";
				result=result+capitalizedWord;
			}
		}
		System.out.println(result.trim());
	}
	public static void main(String[] args)
	{
		String str="jAVA iS eASY ";
		convert(str);
	}

}
