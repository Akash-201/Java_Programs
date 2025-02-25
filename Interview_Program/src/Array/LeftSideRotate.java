package Array;

import java.util.Arrays;

public class LeftSideRotate 
{
	// Method to rotate the array left by one position
	public static void leftRotation(int[] arr)
	{
		int firstIndex=arr[0];   // Store the first element of the array

		// Shift all elements to the left by one position
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];

		}

		// Place the first element at the last position
		arr[arr.length-1]=firstIndex;

		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		leftRotation(arr);
	}
}
