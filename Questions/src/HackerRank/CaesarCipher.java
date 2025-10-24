package HackerRank;

public class CaesarCipher 
{

	public static String caesarCipher(String s, int k) 
	{
		StringBuilder result = new StringBuilder();
		k = k % 26; 

		for (char c : s.toCharArray())
		{
			if (Character.isUpperCase(c))
			{
				// For uppercase letters
				char shifted = (char) ('A' + (c - 'A' + k) % 26);
				result.append(shifted);
			} 
			else if (Character.isLowerCase(c)) 
			{
				// For lowercase letters
				char shifted = (char) ('a' + (c - 'a' + k) % 26);
				result.append(shifted);
			}
			else
			{
				// Non-alphabetic characters remain the same
				result.append(c);
			}

		}
		return result.toString();
	}
	public static void main(String[] args) 
	{
		System.out.println(caesarCipher("middle-Outz",2));  // okffng-Qwvb

	}

}
