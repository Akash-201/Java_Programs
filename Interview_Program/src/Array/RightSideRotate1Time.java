package Array;

//Right Rotate an Array by 1 Position

import java.util.Arrays;

public class RightSideRotate1Time 
{
	public static void rightRotate(int[] arr)
	{
		// Store last element
		int lastIndex=arr[arr.length-1];

		// Shift elements to the right
		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];

		}

		// Place last element at first position
		arr[0]=lastIndex;

		// Print rotated array
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		rightRotate(arr);
	}

}
