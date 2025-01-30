package Arrays;

public class MoveZerosToLast {
	public static int[] moveZerosToLast(int[] arr) {

		int[] newArr = new int[arr.length];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				newArr[index] = arr[i];
				index++;
			}
		}

		return newArr; 

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 0, 4, 0, 5, 0 };
		int[] arr2 = moveZerosToLast(arr);

		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}

}
