package Array;

import java.util.Arrays;

//  Using a New Array (Extra Space)
//  Time Complexity: O(N)
//  Space Complexity: O(N)

public class Reverse_A_Array 
{
	public static void reverseArray(int[] arr)
	{
		int reverseArr[]= new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			reverseArr[i]=arr[arr.length-1-i];
		}
		
		System.out.println("Reversed Array: " + Arrays.toString(reverseArr));
		
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6};
		reverseArray(arr);
		
	}

}
