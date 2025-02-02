package String.programs;

public class Palindrome_String 
{
	public static void check(String str)
	{
		String convert=str.toLowerCase();
		String rev="";
		String temp=convert;
		
		char[] ch=convert.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		
		if(rev.equals(temp))
		{
			System.out.println(temp+" is a palindrome string");
		}
		else
		{
			System.out.println(temp+" is not a palindrome string");
		}
		
	}
	public static void main(String[] args) {
	check("MAm");
	}

}
