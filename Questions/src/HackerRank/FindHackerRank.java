package HackerRank;

public class FindHackerRank 
{
	public static int findHackerRank(String str1)
	{
		String[] str2=str1.split(" ");
		if(str2.length==1)
		{
			str2[0].equals("hackerrank");
			return 0;
		}
		for(int i=0;i<str2.length;i++)
		{
			if(str2[0].equals("hackerrank"))
			{
				return 1;
			}
			else if(str2[str2.length-1].equals("hackerrank"))
			{
				return 2;
			}
			else if(str2[0].equals("hackerrank") && str2[str2.length].equals("hackerrank"))
			{
				return 0;
			}

		}
		return -1;
	}

	public static void main(String[] args) 
	{
		System.out.println(findHackerRank("i love hackerrank")); // 2
		System.out.println(findHackerRank("hackerrank is an awesome place for programmers")); // 1
		System.out.println(findHackerRank("hackerrank")); // 0
		System.out.println(findHackerRank("i think hackerrank is a great place to hangout")); // -1

	}

}
