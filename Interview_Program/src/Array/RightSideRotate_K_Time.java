package Array;

import java.util.Arrays;

public class RightSideRotate_K_Time 
{
	public static void rotateArray(int[] arr)
	{
		int lastIndex=arr[arr.length-1];

		for(int i=arr.length-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[0]=lastIndex;
	}

	public static void rotateArrarK_Times(int[] arr,int k)
	{
		k = k % arr.length; 

		for(int i=1;i<=k;i++)
		{
			rotateArray(arr);
		}
		System.out.println(Arrays.toString(arr)); 
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		rotateArrarK_Times(arr,4);

	}

}
