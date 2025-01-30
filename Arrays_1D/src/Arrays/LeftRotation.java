package Arrays;

 public class LeftRotation {

	// Method to left rotate an array by 1
	public static void leftRotate(int[] arr) {
		int firstElement = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[arr.length - 1] = firstElement;
	}

	// Method to left rotate by k times
	public static void rotateByK(int[] arr, int k) {

		k = k % arr.length;

		for (int i = 1; i <= k; i++) {
			leftRotate(arr);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 3;
		rotateByK(arr, k);

		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
