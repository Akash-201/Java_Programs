package Recursion;

public class SmallestElement
{
	public static int smallElement(int[] arr,int idx)
	{
		// base case
		if(idx==arr.length-1)
			return arr[idx];
		
		// recursive work
		int ans= smallElement(arr, idx+1);
		
		// self work
		return Math.min(arr[idx], ans);
	}
	
	public static void main(String[] args)
	{
		int[] arr= {5,34,2,65,356};
		
		System.out.println(smallElement(arr, 0));
	}

}
