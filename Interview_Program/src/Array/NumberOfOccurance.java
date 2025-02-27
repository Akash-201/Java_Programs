package Array;
// number of occurance of 1st element in a array

public class NumberOfOccurance 
{
	public static void countOccurance(int[] arr)
	{
		int firstIndex=arr[0];
		int count=1;
		for(int i=1;i<arr.length;i++)
		{
			if(firstIndex==arr[i])
			{
				count++;
			}
		}
		System.out.println("Number of occurance of 1st element are: "+count);
	}
	public static void main(String[] args)
	{
		int[] arr= {2,5,3,7,8,2,6,34,355,2};
		countOccurance(arr);
		
		
	}
	

}
