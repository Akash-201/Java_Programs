package String;

//remove instances of words that are repeated more than once, 
//but retain the first occurrence of any case-insensitive repeated word.

public class DuplicateWords
{
	public static void removeDuplicateWords(String str1)
	{
		String[] str2=str1.split(" ");
		String afterRemoving="";
		
		for(int i=0;i<str2.length;i++)
		{
			if(str2[i].equals(" "))
				continue;
			
			afterRemoving+=str2[i]+" ";
			
			
			for(int j=i+1;j<str2.length;j++)
			{
				if(str2[i].equalsIgnoreCase(str2[j]))
				{
					
					str2[j]=" ";
				}
			}
		}
		System.out.println(afterRemoving.trim());
	}
	
	public static void main(String[] args)
	{
		String str1="Sam went went to to to his business";
		removeDuplicateWords(str1);
	}

}
