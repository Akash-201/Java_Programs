package Array;

import java.util.Scanner;

public class SecondLargest2 {

	// Find second largest element in an array
	public static int secondLargest(int[] arr) {
		
		int largest = arr[0];
		int secondLargest = -1;
		

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
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

		System.out.println(secondLargest(arr));
		sc.close();
	}
}
