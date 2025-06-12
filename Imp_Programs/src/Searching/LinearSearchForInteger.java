package Searching;

public class LinearSearchForInteger 
{
	public static void findNumber(int[] arr,int k)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				System.out.println(k+" is present at "+i+" index position");
				return;
			}
			
		}
		System.out.println(k+" is not present");
	}
	public static void main(String[] args)
	{
		int[] arr= {2,5,3,7,9};
		findNumber(arr, 3);
	}

}
