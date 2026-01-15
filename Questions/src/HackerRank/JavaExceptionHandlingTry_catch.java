package HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTry_catch 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);

			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a / b);

		}
		catch (ArithmeticException e)
		{
			System.out.println(e.getClass().getName() + ": / by zero");

		} 
		catch (InputMismatchException e) 
		{
			System.out.println(e.getClass().getName());
		}
	}

}
