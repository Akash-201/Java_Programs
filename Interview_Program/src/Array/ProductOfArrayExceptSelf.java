package Array;

import java.util.Arrays;

//Input: arr[] = [10, 3, 5, 6, 2]
//Output: [180, 600, 360, 300, 900]

public class ProductOfArrayExceptSelf 
{
	public static void print(int[] arr)
	{
		int[] arr1=new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			int product=1;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]!=arr[i])
				{
					product*=arr[j];
				}
			}
			arr1[i]=product;
			index++;
		}
		System.out.println(Arrays.toString(arr1));
		
	}
	public static void main(String[] args)
	{
		int[] arr= {10, 3, 5, 6, 2};
		print(arr);
		
	}
	

}
