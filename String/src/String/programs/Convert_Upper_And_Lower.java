package String.programs;

//convert uppercase letters to lowercase and lowercase letters to uppercase in a string

public class Convert_Upper_And_Lower 
{
	public static void convert(String s)
	{
		char[] ch=s.toCharArray();
		
		String s2="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				s2=s2+Character.toLowerCase(ch[i]);
			}
			else
			{
				s2=s2+Character.toUpperCase(ch[i]);
			}
		}
		System.out.println(s2);
	}
	public static void main(String[] args) {
		String s="Hello World";
		convert(s);
	}

}
