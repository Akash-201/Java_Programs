package String.programs;

public class Integer_To_String 
{
	public static void main(String[] args)
	{
		int i=12345;
//		String str=Integer.toString(i);
		String str=String.valueOf(i);
		
		System.out.println("Converted String: "+str);
		
	}

}
