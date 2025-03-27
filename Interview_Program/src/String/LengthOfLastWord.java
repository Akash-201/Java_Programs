package String;

public class LengthOfLastWord
{
	public static int lengthOfLastWord(String s1)
	{
		String[] s2=s1.split(" ");	
//		return s2[s2.length-1].length();
		
		 for(int i=s2.length-1;i>=0;i--)
         {
             return s2[i].length();
         }
         return s1.length();
		
		
	}
	public static void main(String[]args) {
		String s="Hello World";
		System.out.println(lengthOfLastWord(s));
	}

}
