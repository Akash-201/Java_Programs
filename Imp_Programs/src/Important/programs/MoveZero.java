package Important.programs;

//Given an integer array, move all 0's to the end of it while maintaining the relative order of the non-zero elements.


import java.util.Arrays;


public class MoveZero 
{
	public static void moveZeros(int[] arr)
	{
		int index=0;
		int[] newArr=new int[arr.length];
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]!=0)
			{
				newArr[index]=arr[i];
				index++;
			}
			
		}
		System.out.println(Arrays.toString(newArr));
	}
	
	public static void main(String[] args)
	{
		int[] arr= {0,1,0,3,12,0,23};
		moveZeros(arr);
	}

}
