package Array;

public class Sum_Of_All_Elements 
{
	public static void sumOfAllElements(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of array is: "+sum);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		sumOfAllElements(arr);
	}

}
