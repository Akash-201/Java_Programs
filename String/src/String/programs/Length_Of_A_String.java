package String.programs;

public class Length_Of_A_String
{
	public static void length(String str)
	{
		char[] ch=str.toCharArray();

		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')  // remove space
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String str="Hello World";
		length(str);
	}

}
