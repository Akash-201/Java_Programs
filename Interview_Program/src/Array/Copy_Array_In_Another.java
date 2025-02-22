package Array;

public class Copy_Array_In_Another
{
	public static void copyArrayInAnotherArray(int[] arr)
	{
		int[] newArr=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			newArr[i]=arr[i];
		}
		
		System.out.println("Original Array");
		for(int elem : arr)
		{
			System.out.print(elem+" ");
		}
		
		System.out.println("\nCopy Array");
		for(int elem: newArr)
		{
			System.out.print(elem+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		copyArrayInAnotherArray(arr);

	}

}
