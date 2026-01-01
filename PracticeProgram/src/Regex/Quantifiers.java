package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers 
{
	public static void printPattern(String str)
	{
		Pattern p1=Pattern.compile("a");  // 0--a 2--a 3--a 5--a 6--a 7--a 
		Pattern p2=Pattern.compile("a+");  // 0--a 2--aa 5--aaa  
		Pattern p3=Pattern.compile("a*");  // 0--a 1-- 2--aa 4-- 5--aaa 8-- 9-- 
		Pattern p4=Pattern.compile("a?");  // 0--a 1-- 2--a 3--a 4-- 5--a 6--a 7--a 8-- 9-- 
		Matcher m=p4.matcher(str);

		while(m.find())
		{
			System.out.print(m.start()+"--"+m.group()+" ");
		}
	}
	public static void main(String[] args)
	{
		printPattern("abaabaaab");
	}
}
