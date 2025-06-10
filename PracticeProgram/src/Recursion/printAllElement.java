package Recursion;

public class printAllElement 
{
	public static void printElement(int[] arr,int idx)
	{
		if(idx==arr.length)
			return;
		
		System.out.print(arr[idx]+" ");
		
		printElement(arr, idx+1);
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		printElement(arr, 0);
	}

}
