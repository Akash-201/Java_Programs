package CompanyQuestions;

public class MaxAscendingSum 
{
	public static int maxAscendingSum(int[] arr)
	{
		int maxSum=arr[0];
		int currentSum=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>arr[i-1])
			{
				currentSum+=arr[i];
			}
			else
			{
				currentSum=arr[i];
			}
			maxSum=Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int[] arr= {10,20,30,5,10,20,30};
		System.out.println(maxAscendingSum(arr));
	}

}
