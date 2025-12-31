package Regex;

public class StringClassSplitMethod
{
	public static void printPattern(String str)
	{
		String[] s1=str.split("\\s");
		for(String s2 : s1)
		{
			System.out.println(s2);
		}
	}
	public static void main(String[] args) 
	{
		printPattern("Durga Software Solution");

	}

}
