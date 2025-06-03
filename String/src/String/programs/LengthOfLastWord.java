package String.programs;

public class LengthOfLastWord 
{
	public static void lengthOfLastWord(String s1)
	{
		String[] s2=s1.split(" ");

		for(int i=s2.length-1;i>=0;i--)
		{
			int count=0;
			String word=s2[i];
			char[] ch=word.toCharArray();

			for(int j=0;j<ch.length;j++)
			{
				count++;
			}
			System.out.println(count);
			break;
		}
	}
	public static void main(String[] args) 
	{
		String s1="Hello Backend Developers    ";
		lengthOfLastWord(s1);

	}

}
