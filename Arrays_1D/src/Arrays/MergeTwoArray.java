package Arrays;

import java.util.Arrays;

public class MergeTwoArray 
{
	public static int[] print(int[] arr1,int[] arr2)
	{
		int[] newArr=new int[arr1.length+arr2.length];
		
		for(int i=0;i<=arr1.length-1;i++)
		{
			newArr[i]=arr1[i];
		}
		for(int i=0;i<=arr2.length-1;i++)
		{
			newArr[arr1.length+i]=arr2[i];

		}
		
		return newArr;
		
	}
	public static void main(String[] args)
	{
		int[] arr1= {1,2,3,4};
		int[] arr2= {5,6,7};
		System.out.println(Arrays.toString( print(arr1, arr2)));
		
	}

}
