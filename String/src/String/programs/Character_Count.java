package String.programs;

public class Character_Count 
{

	
	   // with the help of length() method
//	public static void main(String[] args) 
//	{
//		String str="Hello";
//		System.out.println(str.length());
//	}
	
	
	// without length() method
 	public static void count(String str)
	{
		char[] ch=str.toCharArray();
		int c=0;
		String str2="";
		for(int i=0;i<ch.length;i++)
		{
			str2=str2+ch[i];
			c++;
		}
		System.out.println(c);
		
	}
	

	public static void main(String[] args) 
	{
		String str="Hello";
		count(str);
	}
}
