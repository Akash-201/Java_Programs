package String;

public class ReverseString
{
	public static void reverseString(String str)
	{
		String rev="";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		String str="Hello";
		reverseString(str);
	}

}
