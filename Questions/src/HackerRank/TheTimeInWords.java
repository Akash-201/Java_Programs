package HackerRank;

public class TheTimeInWords {
	public static String timeInWords(int h, int m) 
	{
		String[] words = {
				"", "one", "two", "three", "four", "five",
				"six", "seven", "eight", "nine", "ten",
				"eleven", "twelve", "thirteen", "fourteen",
				"fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen", "twenty", "twenty one", "twenty two",
				"twenty three", "twenty four", "twenty five",
				"twenty six", "twenty seven", "twenty eight",
				"twenty nine"
		};

		if (m == 0) 
		{
			return words[h] + " o' clock";
		}

		if (m == 15)
		{
			return "quarter past " + words[h];
		}

		if (m == 30) 
		{
			return "half past " + words[h];
		}

		if (m == 45)
		{
			return "quarter to " + words[h + 1];
		}

		if (m < 30) 
		{
			return words[m] + (m == 1 ? " minute past " : " minutes past ") + words[h];
		} 
		else
		{
			int remaining = 60 - m;
			return words[remaining] + (remaining == 1 ? " minute to " : " minutes to ") + words[h + 1];
		}

	}
	public static void main(String[] args)
	{
		System.out.println(timeInWords(5,47));  // thirteen minutes to six
		System.out.println(timeInWords(3,00));  // three o' clock
		System.out.println(timeInWords(7,15));  // quarter past seven

	}

}
