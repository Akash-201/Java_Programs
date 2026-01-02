package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumber 
{
	public static void checkValidMobileNumber(String str)
	{
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(str);
		
		if(m.find() && m.group().equals(str))
		{
			System.out.println("Valid Mobile Number");
		}
		else
		{
			System.out.println("Invalid Mobile Number");
		}
	}
	public static void main(String[] args) 
	{
		checkValidMobileNumber("919876543211");  // Valid Mobile Number
		checkValidMobileNumber("09845643211");  // Valid Mobile Number
		checkValidMobileNumber("06876543211");  // Invalid Mobile Number
		checkValidMobileNumber("91919876543211"); // Invalid Mobile Number
		
	}

}
