package Arrays;

public class Second_Half_the_Array 
{
	public static void print(int[] arr)
	{
		for(int i=arr.length/2;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8};
	 print(arr);	
	}

}
