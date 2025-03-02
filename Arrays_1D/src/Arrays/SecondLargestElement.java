package Arrays;
// without sorting

public class SecondLargestElement 
{
	public static int secondLargest(int[] arr)
	{
		int largest=arr[0];
		int secondLargest=-1;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]> secondLargest && arr[i]!=largest)
			{
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
	public static void main(String[] args) {
		int[] arr= {5,77,24,97,56,35};
		System.out.println("Second Largest Element Is: "+secondLargest(arr));
	}
	

}
