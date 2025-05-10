package String;

public class ValidUserName 
{
	public static String checkUserName(String str)
	{
		if(str.length()<8 || str.length()>30)
		{
			return "INVALID";
		}
		
		char[] ch=str.toCharArray();
		if(!Character.isLetter(ch[0]))
		{
			return "INVALID";
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isLetter(ch[i]) && !Character.isDigit(ch[i]) && ch[i]!='_')
			{
				return "INVALID";
			}
		}
		return "VALID";
	}
	public static void main(String[] args)
	{
		String str="Hello_World";
		System.out.println(checkUserName(str));
	}

}
