package String;

//find all possible substrings of a given String 

public class Substrings
{
	public static void findAllSubstrings(String str)
	{
		System.out.println("All substrings of \"" + str + "\":");
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
	}
	public static void main(String[] args)
	{
        String str = "abc";
        findAllSubstrings(str);
	}

}
