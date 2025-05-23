package StringBuffer_Programs;

public class ToggleCase 
{
	public static void afterToggle(String str)
	{
		StringBuffer answer=new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z')
			{
				answer.append(Character.toLowerCase(ch));
			}
			else if(ch>='a' && ch<='z')
			{
				answer.append(Character.toUpperCase(ch));
			}
			else
			{
				answer.append(ch);
			}
		}
		System.out.println("Before Toggle: "+str);
		System.out.println("After Toggle: "+answer);
	}
	public static void main(String[] args)
	{
		String str="@TeSt#123";
		afterToggle(str);
	}

}
