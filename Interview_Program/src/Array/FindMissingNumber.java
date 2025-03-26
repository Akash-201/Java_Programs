package Array;

import java.util.Arrays;

public class FindMissingNumber 
{
	public static void findMissingNumber(int[] arr)
	{
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i+1] -arr[i]!=1)
			{
				System.out.println("Missing Number Is: "+(arr[i]+1));
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,6,5,7,8,10};
		findMissingNumber(arr);
		
	}

}
