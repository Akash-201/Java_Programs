package String.programs;

//Write a program to replace a specific character in a given string with another character

public class Replace_Character
{
	public static void replaceCharacter(String str)
	{
		char[] ch=str.toCharArray();
		String str2="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='h' || ch[i]=='H')
			{
				ch[i]='c';
			}
			
		}
		System.out.println(ch);
	
		
	}
	public static void main(String[] args) {
		String str="Hello";
		replaceCharacter(str);
	}

}
