package Regex;

import java.util.regex.Pattern;

public class PatternClassSplitMethod 
{
	public static void printPattern(String str)
	{
		Pattern p=Pattern.compile("\\s");
		String[] s=p.split(str);
		
		for(String s1 : s)
		{
			System.out.println(s1);
		}
	}
	public static void main(String[] args) {
		printPattern("Durga Software Solutions");
	}

}
