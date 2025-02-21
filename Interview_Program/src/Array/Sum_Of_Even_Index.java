package Array;

public class Sum_Of_Even_Index 
{
	public static void sumOfEvenIndex(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i+=2)
		{
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of even index is: "+sum);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		sumOfEvenIndex(arr);
	}

}
