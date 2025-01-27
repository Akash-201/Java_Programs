package Important.programs;

import java.util.Scanner;

public class SmithNumber {

	// Method to calculate the sum of the digits of a number
	public static int sumOfDigits(int n) {
		int sumOfDigits = 0;
		while (n > 0) {
			sumOfDigits = sumOfDigits + (n % 10);
			n = n / 10;
		}

		return sumOfDigits;
	}

	// Method to calculate the sum of prime factors of a number
	public static int sumOfPrimeFactors(int n) {

		int sumOfPrimeFactors = 0;
		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				sumOfPrimeFactors = sumOfPrimeFactors + sumOfDigits(i);
				n = n / i;
			}
		}

		if (n != 1) {
			sumOfPrimeFactors = sumOfPrimeFactors + sumOfDigits(n);
		}

		return sumOfPrimeFactors;
	}

	// Method to check whether the number is a smith number or not
	public static boolean isSmith(int n) {
		return sumOfDigits(n) == sumOfPrimeFactors(n);
	}

	public static void main(String[] args)
	{
		while(true) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();

		System.out.println(isSmith(n));

	}
	}
}
