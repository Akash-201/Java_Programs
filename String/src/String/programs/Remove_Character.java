package String.programs;

public class Remove_Character
{
	public static void removeCharacter(String s1)
	{
		char[] ch=s1.toCharArray();
		String s2="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='o')
			{
				s2=s2+ch[i];
			}
		}
		
		System.out.println(s2);
		
		
	}
	public static void main(String[] args) {
		String s1="Hello World";
		removeCharacter(s1);
	}

}
