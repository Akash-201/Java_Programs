package HackerRank;

public class ValidUsernameRegularExpression 
{
	public static String  validUsername(String str)
	{
		if(str.length()<8 || str.length()>30)
			return "Invalid";

		char[] ch=str.toCharArray();

		if(!Character.isLetter(ch[0]))
			return "Invalid";

		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isLetter(ch[i]) && !Character.isDigit(ch[i]) && ch[i]!='_')
				return "Invalid";
		}
		return "Valid";

	}

	public static void main(String[] args) 
	{
		System.out.println(validUsername("Julia"));  // Invalid
		System.out.println(validUsername("Samantha")); // Valid
		System.out.println(validUsername("_Julia007")); //Invalid
		System.out.println(validUsername("JuliaZ007")); // Valid
		System.out.println(validUsername("1Samantha")); // Invalid
		System.out.println(validUsername("Samantha?10_2A")); // Invalid
		System.out.println(validUsername("Julia@007"));  // Invalid
	}
}
