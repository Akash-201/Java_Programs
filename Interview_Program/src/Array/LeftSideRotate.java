package Array;

import java.util.Arrays;

public class LeftSideRotate 
{
	public static void leftRotation(int[] arr)
	{
		int firstIndex=arr[0];

		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];

		}
		arr[arr.length-1]=firstIndex;
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		leftRotation(arr);
	}
}
