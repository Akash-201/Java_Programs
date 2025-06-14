package Sorting;

public class MergeSort {

	// Main merge sort method: recursively divides the array
	public static void mergeSort(int[] arr, int start, int end) {
		// Base case: if start >= end, the array has one or no elements (already sorted)
		if (start >= end) return;

		// Find the middle point to divide the array into two halves
		int mid = (start + end) / 2;

		// Recursively sort the first and second halves
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);

		// Merge the sorted halves
		merge(arr, start, mid, end);
	}

	// Merge function to combine two sorted halves into one sorted array
	public static void merge(int[] arr, int start, int mid, int end) {
		// Find sizes of the two subarrays
		int n1 = mid - start + 1;
		int n2 = end - mid;

		// Create temporary arrays
		int[] left = new int[n1];
		int[] right = new int[n2];

		// Copy data into left[] and right[] arrays
		for (int i = 0; i < n1; i++) {
			left[i] = arr[start + i];
		}
		for (int j = 0; j < n2; j++) {
			right[j] = arr[mid + 1 + j];
		}

		// Initial indexes of the subarrays and merged array
		int i = 0, j = 0, k = start;

		// Merge the temporary arrays back into arr[]
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}

		// Copy remaining elements of left[] if any
		while (i < n1) {
			arr[k++] = left[i++];
		}

		// Copy remaining elements of right[] if any
		while (j < n2) {
			arr[k++] = right[j++];
		}
	}

	// Driver code
	public static void main(String[] args) {
		int[] arr = {5, 3, 4, 1, 2,45,36,38};

		System.out.println("Array before sorting:");
		for (int val : arr) {
			System.out.print(val + " ");
		}

		// Perform merge sort
		mergeSort(arr, 0, arr.length - 1);

		System.out.println("\nArray after sorting:");
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
