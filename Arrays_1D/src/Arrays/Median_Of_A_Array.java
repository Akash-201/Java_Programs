package Arrays;

//the middle number in a sorted ascending or descending list of numbers

public class Median_Of_A_Array 
{
	
	public static void medianOfArray(int[] arr)
	{
		double median;
		if(arr.length%2==0)
		{
			 median= (arr[arr.length/2-1]+ arr[arr.length/2])/2.0;
		}
		else
		{
			 median= arr[arr.length/2];
		}
		
		System.out.println("Median: "+median);
	}
	public static void main(String[] args)
	{
		int[] arr= {1,3,4,7,9,11};
		medianOfArray(arr);
	}
	
	

}
