package CompanyQuestions;

public class PalindromeString
{
	public static void checkPalindrome(String str)
	{
		
		str=str.toLowerCase();
		String temp=str;
		String revrese="";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			revrese=revrese+ch[i];
		}
		if(temp.equals(revrese))
		{
			System.out.println(temp+" is a Palindrome String");
		}
		else
		{
			System.out.println(temp+" is not a Palindrome String");
		}
	}
	public static void main(String[] args)
	{
		String str="mam";
		checkPalindrome(str);

	}


}
