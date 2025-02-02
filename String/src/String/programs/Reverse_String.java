package String.programs;

public class Reverse_String 
{
	public static void reverse(String str)
	{
		String rev="";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args) 
	{
		reverse("Hello");
		
	}

}
