package Arrays;

public class Smallest_Element_In_A_Array
{
	public static void print(int[] arr)
	{
		int smallestElement=arr[0];
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]<arr[0])
			{
				arr[0]=arr[i];
			}
		}
		System.out.println(arr[0]);
		
	}
	public static void main(String[] args) 
	{
		int []arr= {2,4,1,5,7,0,-9};
		print(arr);
		
	}

}
