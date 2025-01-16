package _2D_Arrays;

public class SumOfElements {
	public static void main(String[] args) {
		int sum = 0;

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}

		System.out.println(sum);
	}
}
