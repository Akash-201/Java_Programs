package HackerRank;

public class SplitThePhoneNumbers
{
	public static void printPhoneNumber(String s)
	{
		String[] word=s.split("[ -]");

		System.out.println("CountryCode=" + word[0] +
				",LocalAreaCode=" + word[1] +
				",Number=" + word[2]);
	}
	public static void main(String[] args) 
	{
		printPhoneNumber("1 877 2638277");  // CountryCode=1,LocalAreaCode=877,Number=2638277
		printPhoneNumber("91-011-23413627"); // CountryCode=91,LocalAreaCode=011,Number=23413627

	}

}
