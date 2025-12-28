package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo 
{
	public static void findPattern(String str)
	{
		int count=0;

		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher(str);

		while(m.find())
		{
			count++;
			System.out.println(m.group()+" "+m.start()+" "+m.end());
		}
		System.out.println("The number of occurrences: "+count);
	}
	public static void main(String[] args) 
	{
		findPattern("ababbaba");
	}

}
