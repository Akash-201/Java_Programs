package Arrays;

public class Largest_Element_In_A_Array
{
	public static void print(int[] arr)
	{
		int largestElement=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>arr[0])
			{
				arr[0]=arr[i];
			}
		}
		System.out.println(arr[0]);
	}
	public static void main(String[] args)
	{
		int []arr= {1,2,-3,-4,15,0,-9};
		print(arr);
		
	}

}
