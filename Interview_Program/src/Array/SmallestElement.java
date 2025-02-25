package Array;

public class SmallestElement 
{
	public static int smallestElement(int[] arr)
	{
		int smallNumber=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<smallNumber)
			{
				smallNumber=arr[i];
			}
		}
		return smallNumber;
	}
	public static void main(String[] args) {
		int[] arr= {4,6,2,76,965,43,1};
		System.out.println("Smallest Element: "+smallestElement(arr));
	}

}
