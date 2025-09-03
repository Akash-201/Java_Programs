package _4CECloudLabs;

import java.util.Arrays;

public class DoubleSizableArray 
{
	public static int[] printArray(int[] arr)
	{
		int newArray[]=new int[(arr.length)*2];
		for(int i=0;i<arr.length;i++)
		{
			newArray[i]=arr[i];
			newArray[i+arr.length]=arr[i];
		}
		return newArray;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3};
		int[] result=printArray(arr);
		System.out.println(Arrays.toString(result));
	}

}
