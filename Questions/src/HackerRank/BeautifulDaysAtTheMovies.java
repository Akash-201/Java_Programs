package HackerRank;

public class BeautifulDaysAtTheMovies 
{
	public static int beautifulDays(int i, int j, int k) 
	{

		int count = 0;

		for (int day = i; day <= j; day++) 
		{
			int reversedDay = reverse(day);
			int difference = Math.abs(day - reversedDay);

			if (difference % k == 0)
			{
				count++;
			}
		}

		return count;
	}

	public static int reverse(int number) 
	{
		int reversed = 0;

		while (number > 0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number = number / 10;
		}

		return reversed;
	}

	public static void main(String[] args)
	{
		System.out.println(beautifulDays(20,23,6));  // 2

	}

}
