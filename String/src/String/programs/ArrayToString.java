package String.programs;

public class ArrayToString 
{
	public static String convert(char[] ch)
	{
		String res="";
		for(int i=0;i<ch.length;i++)
		{
			res=res+ch[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		char[] ch= {'h','e','l','l','o'};
		System.out.println(convert(ch));
	}

}
