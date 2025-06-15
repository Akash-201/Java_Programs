package Sorting;

public class QuickSort {

	// Main method to apply QuickSort recursively
	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// Partitioning index
			int pivotIndex = partition(arr, low, high);

			// Recursively sort elements before and after partition
			quickSort(arr, low, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, high);
		}
	}

	// Partition method: places pivot at correct position
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high]; // Choosing the last element as pivot
		int i = low - 1; // Index of smaller element

		for (int j = low; j < high; j++) {
			// If current element is smaller than pivot
			if (arr[j] < pivot) {
				i++;
				// Swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Swap pivot with the element at i+1
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1; // Return the pivot index
	}

	// Driver method
	public static void main(String[] args) {
		int[] arr = {10, 7, 8, 9, 1, 5};

		System.out.println("Before sorting:");
		for (int val : arr) {
			System.out.print(val + " ");
		}

		quickSort(arr, 0, arr.length - 1);

		System.out.println("\nAfter sorting:");
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}
}
