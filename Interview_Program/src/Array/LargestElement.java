package Array;

public class LargestElement
{
	public static int largestElement(int[] arr)
	{
		int largestNumber=arr[0];

		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largestNumber)
			{
				largestNumber=arr[i];
			}
		}
		return largestNumber;
	}
	public static void main(String[] args) {
		int[] arr= {1,4,3,7,367,7};

		System.out.println("Largest Element: " + largestElement(arr));
	}

}
