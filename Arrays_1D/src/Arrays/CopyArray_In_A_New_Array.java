package Arrays;

public class CopyArray_In_A_New_Array 
{
	public static void print(int[] arr)
	{
		int[] newArr=new int[arr.length];
		for(int i=0;i<=arr.length-1;i++)
		{
			newArr[i]=arr[i];
		}
		
		System.out.println("Original Array");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(+arr[i]+" ");
		}
		
		
		System.out.println("\nCopy Array");
		for(int i=0;i<=newArr.length-1;i++)
		{
			System.out.print(newArr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		print(arr);
		
	}

}
