package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharacterClass 
{
	public static void printPattern(String str)
	{
		Pattern p1=Pattern.compile("\\s"); //  --3
		Pattern p2=Pattern.compile("\\S"); // a--0 7--1 b--2 k--4 @--5 9--6 
		Pattern p3=Pattern.compile("\\d"); // 7--1 9--6 
		Pattern p4=Pattern.compile("\\D"); // a--0 b--2  --3 k--4 @--5 
		Pattern p5=Pattern.compile("\\w"); // a--0 7--1 b--2 k--4 9--6 
		Pattern p6=Pattern.compile("\\W"); // --3 @--5 
		Pattern p7=Pattern.compile("."); // a--0 7--1 b--2  --3 k--4 @--5 9--6 
		Matcher m=p7.matcher(str);
		
		while(m.find())
		{
			System.out.print(m.group()+"--"+m.start()+" ");
		}

	}
	public static void main(String[] args) {
		printPattern("a7b k@9");
	}

}
