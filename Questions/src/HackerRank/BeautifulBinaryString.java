package HackerRank;

public class BeautifulBinaryString
{
	public static int beautifulBinaryString(String b) 
	{
		int count = 0;
		for (int i = 0; i < b.length() - 2; )
		{
			if (b.substring(i, i + 3).equals("010"))
			{
				count++;
				i += 3; 
			}
			else 
			{
				i++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		System.out.println(beautifulBinaryString("0100101010"));  // 3
		System.out.println(beautifulBinaryString("01100"));  // 0
		
	}

}
