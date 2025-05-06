package CompanyQuestions;

import java.util.Arrays;

public class SquaresOfSortedArray 
{
	public static void squareOfSortedArray(int[] arr)
	{
		int[]  arr1=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			arr1[index]=arr[i]*arr[i];
			index++;
		}
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
	public static void main(String[] args)
	{
		int[] arr= {-4,-1,0,3,10};
		squareOfSortedArray(arr);
	}

}
