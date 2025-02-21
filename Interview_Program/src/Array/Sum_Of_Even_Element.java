package Array;

public class Sum_Of_Even_Element 
{
	public static void sumOfEvenElement(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("Sum of even elements is: "+sum);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		sumOfEvenElement(arr);
	}

}
