package String.programs;

//Check Subsequence
//Input: 'abc', 'ahbgdc' => Output: true

public class CheckSubsequence 
{
	public static void checkSubsequence(String str1,String str2)
	{
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
			char ch1=str1.charAt(i);
			
			for(int j=0;j<str2.length();j++)
			{
				char ch2=str2.charAt(j);
				if(ch1==ch2)
				{
					count++;
					str2=str2.substring(j+1);
					break;
				}
			}
		}
		if(count==str1.length())
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}
	public static void main(String[] args)
	{
		String str1="abc";
		String str2="ahbgdc";
		checkSubsequence(str1, str2);
		
	}

}
