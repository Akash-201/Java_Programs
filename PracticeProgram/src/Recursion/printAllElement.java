package Recursion;

public class printAllElement 
{
	public static void printElement(int[] arr,int idx)
	{
		// base case
		if(idx==arr.length)
			return;
		
		// self work
		System.out.print(arr[idx]+" ");
		
		// recursive work - sub problem
		printElement(arr, idx+1);
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		printElement(arr, 0);
	}

}
