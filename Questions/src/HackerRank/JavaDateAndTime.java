package HackerRank;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime
{
	public static String findDay(int month, int day, int year) 
	{
		LocalDate date = LocalDate.of(year, month, day);
		return date.getDayOfWeek().toString(); 
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter month: ");
		int month = sc.nextInt();
		System.out.print("Enter day: ");
		int day = sc.nextInt();
		System.out.print("Enter year: ");
		int year = sc.nextInt();

		String result = findDay(month, day, year);

		System.out.println(result);

		sc.close();

	}

}
