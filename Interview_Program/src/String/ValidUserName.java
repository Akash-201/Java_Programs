package String;

//The username consists of 8  to 30 characters inclusive.
//If the username consists of less than 8 or greater than 30 characters, then it is an invalid username. 

//The username can only contain alphanumeric characters and underscores (_). 
//Alphanumeric characters describe the character set consisting of 
//lowercase characters [a-z] , uppercase characters [A-Z] , and digits [0-9]. 

//The first character of the username must be an alphabetic character,
//i.e., either lowercase character [a-z] or uppercase character [A-Z].

public class ValidUserName 
{
	public static String checkUserName(String str)
	{
		if(str.length()<8 || str.length()>30)
		{
			return "INVALID";
		}
		
		char[] ch=str.toCharArray();
		if(!Character.isLetter(ch[0]))
		{
			return "INVALID";
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isLetter(ch[i]) && !Character.isDigit(ch[i]) && ch[i]!='_')
			{
				return "INVALID";
			}
		}
		return "VALID";
	}
	public static void main(String[] args)
	{
		String str="Hello_World";
		System.out.println(checkUserName(str));
	}

}
