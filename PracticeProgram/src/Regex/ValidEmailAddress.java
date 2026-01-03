package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailAddress 
{
	public static void checkValidEmailAddress(String str)
	{
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m=p.matcher(str);
		if(m.find() && m.group().equals(str))
		{
			System.out.println("Valid Email Address");
		}
		else
		{
			System.out.println("Invalid Email Address");
		}
	}
	public static void main(String[] args) 
	{
		checkValidEmailAddress("xyz@gmail.com");  // Valid Email Address
		checkValidEmailAddress("xyz@gmailcom");  // Invalid Email Address
		checkValidEmailAddress("xyz123gmail.com");  // Invalid Email Address
		checkValidEmailAddress("123xyz@gmail.com");  // Valid Email Address

	}

}
