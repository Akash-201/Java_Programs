package TwoPointer;

import java.util.Arrays;

public class RemoveDuplicate 
{
	public static void removeDuplicates(int[] arr)
	{
		Arrays.sort(arr);

		if(arr.length==0)
		{
			return;
		}
		int j=0;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[j])
			{
				j++;
				arr[j]=arr[i];
			}
		}

		for(int i=0;i<=j;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {4, 2, 1, 2, 3, 4, 1, 5};
		removeDuplicates(arr);
	}


}
