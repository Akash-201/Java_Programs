package Array;

public class Sum_And_Average 
{
	public static void sumAndAverage(int[] arr)
	{
		double sum=0;
		int length=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		double average=sum/length;
		
		System.out.println("Sum of array is: "+sum);
		System.out.println("Average of Array is: "+average);
		
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,6,5};
		sumAndAverage(arr);
	}

}
