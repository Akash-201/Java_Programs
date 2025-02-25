package Array;

import java.util.Arrays;

public class LeftSideRotate_K_Times 
{
	// Method to rotate the array left by one position
	public static void leftSideRotate(int[] arr)
	{
		int firstIndex=arr[0];

		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=firstIndex;
	}

	// Method to rotate the array left by k times
	public static void leftRotate_K_Times(int[] arr, int k)
	{
		k=k% arr.length;
		for(int i=1;i<=k;i++)
		{
			leftSideRotate(arr);
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		leftRotate_K_Times(arr, 3);
	}


}
