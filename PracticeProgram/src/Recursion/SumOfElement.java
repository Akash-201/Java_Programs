package Recursion;

public class SumOfElement
{
	public static int sumOfElement(int[] arr,int idx)
	{
		// base case
		if(idx==arr.length)
			return 0;

		//recursive work
		
		int sum=sumOfElement(arr, idx+1);

		// self work
		return sum+arr[idx];
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4};
		System.out.println(sumOfElement(arr, 0));
	}

}
