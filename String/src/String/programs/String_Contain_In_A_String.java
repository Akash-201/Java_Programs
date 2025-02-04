package String.programs;

public class String_Contain_In_A_String 
{
	public static void main(String[] args)
	{
		String str="Hello";
		String subStr="Hell";
		
		if(str.contains(subStr))
		{
			System.out.println(subStr+" is containing in "+str);
		}
		else
		{
			System.out.println(subStr+" is not containing in "+str);
		}
		
	}

}
