package Array;

public class Print_Array 
{
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5};
		printArray(arr);
		
	}

}
