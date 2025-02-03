package String.programs;

public class RemoveSpace 
{
	public static void print(String str)
	{
		String str2="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
				str2=str2+ch[i];
			}
		}
		System.out.println(str2);
	}
	public static void main(String[] args)
	{
		print("Remove Space");
		
	}

}
