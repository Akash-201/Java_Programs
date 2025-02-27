package Array;

import java.util.Arrays;

public class MoveZeroRightSide 
{
	public static void moveZeroRightSide(int[] arr)
	{
		int[] newArr=new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				newArr[index]=arr[i];
				index++;
			}
		}
		System.out.println("Original Array:"+Arrays.toString(arr));
		System.out.println("After moving 0 in right side and 1 in left side: "+Arrays.toString(newArr));
		
	}
	public static void main(String[] args) {
		int[] arr= {0,1,0,1,1,0,0,1};
		moveZeroRightSide(arr);
	}

}
