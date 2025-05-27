package TwoPointer;

import java.util.Arrays;

public class MergeTwoSortedArrays 
{
	public static void mergeArrays(int[] arr1,int[] arr2)
	{
		int[] newArr=new int[arr1.length+arr2.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<arr2[j])
			{
				newArr[k++]=arr1[i++];
			}
			else
			{
				newArr[k++]=arr2[j++];
			}
		
		}
		
		while (i < arr1.length)
		{
			newArr[k++] = arr1[i++];
		}

		while (j < arr2.length)
		{
			newArr[k++] = arr2[j++];
		}
		
		System.out.println(Arrays.toString(newArr));
		
	}
	public static void main(String[] args)
	{
		int[] arr1= {1,3,5,7};
		int[] arr2= {2,4,6,8};
		mergeArrays(arr1, arr2);
		
		
		
	}

}
