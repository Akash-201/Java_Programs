package Array;

import java.util.Arrays;

public class MoveZeroLeftSide
{
	public static void moveZeroLeftSide(int[] arr)
	{
		int[] newArr=new int[arr.length];
		int index=arr.length-1;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=0)
			{
				newArr[index]=arr[i];
				index--;
			}
		}
		System.out.println("Original Array: "+Arrays.toString(arr));
		System.out.println("After moving 0 in left side and 1 in right side: "+Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		int[] arr= {0,1,0,1,1,0,0,1};
		moveZeroLeftSide(arr);
	}

}
