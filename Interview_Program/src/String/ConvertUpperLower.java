package String;

//converts all uppercase letters to lowercase and all lowercase letters to uppercase

public class ConvertUpperLower 
{
	public static void convertUpperLower(String str)
	{
		char[] ch=str.toCharArray();
		String convert="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				convert+=Character.toLowerCase(ch[i]);
			
			}
			else
			{
				convert+=Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(convert);
	}
	public static void main(String[] args)
	{
		convertUpperLower("Hello World");
	}

}
