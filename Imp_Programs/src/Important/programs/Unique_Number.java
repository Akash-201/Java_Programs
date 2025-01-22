package Important.programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_Number {

	// Method to check if the number is unique on not
	//	public static boolean isUnique(int n) {
	//		String s = n + "";
	//		char[] characters = s.toCharArray();
	//		Set<Character> st = new HashSet<Character>();
	//		for (int i = 0; i < characters.length; i++) {
	//			st.add(characters[i]);
	//		}
	//
	//		int countDigits = 0;
	//		while (n > 0) {
	//			countDigits++;
	//			n /= 10;
	//		}
	//
	//		return st.size() == countDigits;
	//	}

	public static boolean isUnique(int n) {
		boolean[] unique = new boolean[10];

		while (n > 0) {
			int rem = n % 10;
			if (unique[rem] == true) {
				return false;
			} else {
				unique[rem] = true;
			}

			n /= 10;
		}

		return true;
	}

	// Main method
	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();

			if (isUnique(n)) {
				System.out.print("Unique number");
			} else {
				System.out.println("Not a unique number");
			}

			sc.close();

		}
	}
}
