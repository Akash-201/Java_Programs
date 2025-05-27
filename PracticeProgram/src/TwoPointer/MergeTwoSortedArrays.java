package TwoPointer;

import java.util.Arrays;

public class MergeTwoSortedArrays 
{
	public static void mergeArrays(int[] arr1,int[] arr2)
	{
		int[] newArr=new int[arr1.length+arr2.length];

		int i=0;  // pointer for arr1
		int j=0;  // pointer for arr2
		int k=0;  // pointer for newArr

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
		// Copy remaining elements of arr1
		while (i < arr1.length)
		{
			newArr[k++] = arr1[i++];
		}

		// Copy remaining elements of arr2
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
