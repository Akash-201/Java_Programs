package HackerRank;

public class DayOfTheProgrammer
{
	public static String dayOfProgrammer(int year)
	{
		if (year == 1918) 
		{
			// Special case: transition year
			return "26.09.1918";
		}
		else if (year < 1918) 
		{
			// Julian calendar
			if (year % 4 == 0) 
			{
				return "12.09." + year; // leap
			} 
			else 
			{
				return "13.09." + year; // normal
			}
		}
		else 
		{
			// Gregorian calendar
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
			{
				return "12.09." + year; // leap
			} 
			else 
			{
				return "13.09." + year; // normal
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(dayOfProgrammer(2017));  // 13.09.2017
		System.out.println(dayOfProgrammer(2016));  // 12.09.2016
		System.out.println(dayOfProgrammer(1800));  // 12.09.1800
	}

}
