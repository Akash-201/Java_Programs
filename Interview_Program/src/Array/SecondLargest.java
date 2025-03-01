package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

	// Find second largest element in an array
	public static int secondLargest(int[] arr) {

		Arrays.sort(arr);
		int largest = arr[arr.length - 1];
		int secondLargest = -1;

		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] != largest) {
				secondLargest = arr[i];
				break;
			}
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		if (secondLargest(arr) != -1) {
			System.out.println("Second largest: " + secondLargest(arr));
		} else {
			System.out.println("The array doesn't contain any second largest");
		}
		sc.close();
	}
}
