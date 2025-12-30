package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClass 
{
	public static void printPattern(String str)
	{
		Pattern p1=Pattern.compile("[abc]");  // 0--a 2--b 
		Pattern p2=Pattern.compile("[^abc]");  // 1--7 3--@ 4--z 5--# 6--9 
		Pattern p3=Pattern.compile("[a-z]");  // 0--a 2--b 4--z 
		Pattern p4=Pattern.compile("[0-9]");  // 1--7 6--9 
		Pattern p5=Pattern.compile("[a-zA-Z0-9]"); // 0--a 1--7 2--b 4--z 6--9 
		Pattern p6=Pattern.compile("[^a-zA-Z0-9]");  // 3--@ 5--# 
		Pattern p7=Pattern.compile("[A-Z]");  // 
		Pattern p8=Pattern.compile("[a-zA-Z]"); //  0--a 2--b 4--z 
		Matcher m=p8.matcher(str);
		
		while(m.find() )
		{
			System.out.print(m.start()+"--"+m.group()+" ");
		}
		
	}
	public static void main(String[] args)
	{
		printPattern("a7b@z#9");
	}

}
