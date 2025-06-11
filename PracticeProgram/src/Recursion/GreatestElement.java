package Recursion;

public class GreatestElement
{
	public static int maxElement(int[] arr,int idx)
	{
		// base case
		if(idx==arr.length-1)
			return arr[idx];

		//recursive work
		int ans=maxElement(arr, idx+1);

		// self work
		return Math.max(arr[idx], ans);


	}
	public static void main(String[] args)
	{
		int[] arr= {2,6,4,8,34,7};
		System.out.println(maxElement(arr, 0));
	}

}
