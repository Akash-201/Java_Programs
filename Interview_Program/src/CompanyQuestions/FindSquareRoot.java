package CompanyQuestions;

public class FindSquareRoot
{
	public static int findNumber(int[] arr, int k)
	{
		int min=0;
		int max=arr.length-1;
		
		while(min<=max)
		{
			int middle=(min+max)/2;
			int square= arr[middle]*arr[middle];
			if(square==k)
			{
				return arr[middle];
			}
			else if(square > k)
			{
				  max = middle - 1;
			}
			else
			{
				min=middle+1;
			}
			
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,4,5,6,7,8,9};
		int k=9;
		System.out.println(findNumber(arr, k));
	}

}
