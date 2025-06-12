package Searching;

public class BinarySearch 
{
	public static void searchElement(int[] arr,int item)
	{
		int lowerItem=0;
		int higherItem=arr.length-1;
		int middleItem=(lowerItem+higherItem)/2;
		
		while(lowerItem<=higherItem)
		{
			if(arr[middleItem]==item)
			{
				System.out.println(item+" is present at "+middleItem+" index position");
				return;
			}
			else if(arr[middleItem]<item)
			{
				lowerItem=middleItem+1;
			}
			else
			{
				higherItem=middleItem-1;
			}
			middleItem=(lowerItem+higherItem)/2;
		}
		
		System.out.println(item+" is not present in this list");
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,4,5,7,8,9,10};
		int item=14;
		searchElement(arr, item);
	}

}
