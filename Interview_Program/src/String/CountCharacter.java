package String;

public class CountCharacter 
{
	public static void countCharacter(String s1)
	{
		char[] ch=s1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		String s1="Hello World";
		countCharacter(s1);
	}

}
