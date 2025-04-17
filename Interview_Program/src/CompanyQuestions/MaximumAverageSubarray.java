package CompanyQuestions;


public class MaximumAverageSubarray
{
	public static double maximumAverageSubarray(int[] arr, int k)
	{
		double maxSum=0;
		for(int i=0;i<=arr.length-k;i++)
		{
			double currSum=0;
			
			for(int j=0;j<k;j++)
			{
				currSum=currSum+arr[i+j];
			}
			if(maxSum<=currSum)
			{
				maxSum=currSum;
			}
		}
		maxSum=maxSum/k;
		return maxSum;
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,12,-5,-6,50,3};
		int k=4;
		System.out.println(maximumAverageSubarray(arr, k));
	}

}
