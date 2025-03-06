package String;



public class ReverseWord 
{
	public static void reverseWord(String str)
	{
		String[] s=str.split(" ");
		String s2="";
		for(int i=s.length-1;i>=0;i--)
		{
			s2=s2+s[i]+" ";
		}
		System.out.println(s2+" ");
	}
	public static void main(String[] args)
	{
		String str="Hello World";
		reverseWord(str);
	}

}
