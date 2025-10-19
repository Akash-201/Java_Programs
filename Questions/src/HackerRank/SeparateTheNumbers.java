package HackerRank;

public class SeparateTheNumbers 
{
	public static void separateNumbers(String s) 
	{
		if (s.charAt(0) == '0') 
		{
			System.out.println("NO");
			return;
		}
		int len = s.length();

		for (int i = 1; i <= len / 2; i++) 
		{
			String firstNumStr = s.substring(0, i);
			long firstNum = Long.parseLong(firstNumStr);

			StringBuilder sb = new StringBuilder(firstNumStr);
			long nextNum = firstNum;


			while (sb.length() < len) 
			{
				nextNum++;
				sb.append(nextNum);
			}


			if (sb.toString().equals(s)) 
			{
				System.out.println("YES " + firstNum);
				return;
			}
		}

		System.out.println("NO");
	}

	public static void main(String[] args)
	{
		separateNumbers("99910001001");   // YES 999
		separateNumbers("7891011");   // YES 7
		separateNumbers("9899100");   // YES 98
		separateNumbers("999100010001");  // NO
		



	}


}
