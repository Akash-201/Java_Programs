package NumberPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void checkArmstrongNumber(int n) {
		int temp = n;
		int countDigits = 0;

		while (temp > 0) {
			countDigits++;
			temp /= 10;
		}

		// reset temp
		temp = n;
		int sumOfPoweredDigit = 0;

		while (temp > 0) {
			int rem = temp % 10;
//			int powerOfDigit = 1;
//			for (int i = 1; i <= countDigits; i++) {
//				powerOfDigit *= rem;
//			}
//			sumOfPoweredDigit += powerOfDigit;
			sumOfPoweredDigit += Math.pow(rem, countDigits);
			temp /= 10;
		}

		if (n == sumOfPoweredDigit) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		checkArmstrongNumber(n);
	}

}
