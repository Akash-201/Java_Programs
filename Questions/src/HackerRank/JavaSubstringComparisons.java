package HackerRank;

import java.util.Scanner;

public class JavaSubstringComparisons 
{
	public static String getSmallestAndLargest(String s, int k) 
	{
		String smallest = s.substring(0, k);
		String largest = s.substring(0, k);

		for (int i = 1; i <= s.length() - k; i++) {
			String currentSubstring = s.substring(i, i + k);
			if (currentSubstring.compareTo(smallest) < 0) {
				smallest = currentSubstring;
			}
			if (currentSubstring.compareTo(largest) > 0) {
				largest = currentSubstring;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter s: ");
		String s = scan.next();

		System.out.print("Enter k: ");
		int k = scan.nextInt();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
