package Array;

public class SearchInSortedAndRotatedArray 
{
	
	public static int searchElement(int[] arr,int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] arr= {3, 5, 1, 2};
		int k=6;
		System.out.println(searchElement(arr, k));
	}
	

}
