package InterviewerAsked;

public class FirstNonRepeatedCharacter 
{
	public static void findCharacter(String s)
	{
		for(int i=0;i<s.length();i++) 
		{
			int count=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(s.charAt(i));
				return;
			}
		}
		System.out.println("No non-repeated character found...");
	}
	public static void main(String[] args)
	{
		findCharacter("anagram");  // n
		findCharacter("stress");  // t
		findCharacter("java");  // j

	}
}
