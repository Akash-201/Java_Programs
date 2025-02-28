package String;

public class PalindromeString 
{
	public static void checkPalindrome(String str)
	{
		String rev="";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev+=ch[i];
		}
		if(rev.equals(str))
		{
			System.out.println(str+" is a palindrome String");
		}
		else
		{
			System.out.println(str+" is not a palindrome String");

		}
	}
	public static void main(String[] args) {
		String str="madam";
		checkPalindrome(str);
	}

}
