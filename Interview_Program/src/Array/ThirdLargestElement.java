package Array;

import java.util.Scanner;

public class ThirdLargestElement {

	// Find second largest element in an array
	public static int thirdLargest(int[] arr) {

		int largest = arr[0];
		int secondLargest = -1;
		int thirdLargest = -1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			} else if (arr[i] > thirdLargest && arr[i] != secondLargest) {
				thirdLargest = arr[i];
			}
		}

		return thirdLargest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(thirdLargest(arr));
		sc.close();
	}
}
