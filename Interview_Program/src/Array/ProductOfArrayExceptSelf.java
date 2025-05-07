//Given an array arr[] of n integers, construct a product array res[] (of the same size) 
//such that res[i] is equal to the product of all the elements of arr[] except arr[i]. 

//Example:

//Input: arr[] = [10, 3, 5, 6, 2]
//Output: [180, 600, 360, 300, 900]

//Explanation: 

//For i=0, res[i] = 3 * 5 * 6 * 2 is 180.
//For i = 1, res[i] = 10 * 5 * 6 * 2 is 600.
//For i = 2, res[i] = 10 * 3 * 6 * 2 is 360.
//For i = 3, res[i] = 10 * 3 * 5 * 2 is 300.
//For i = 4, res[i] = 10 * 3 * 5 * 6 is 900.



package Array;
import java.util.Arrays;


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
