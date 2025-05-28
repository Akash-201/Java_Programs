package InterviewerAsked;

public class FindMissingNumber
{
	public static void findNumber(int[] arr)
	{
		int n=arr.length+1;
		int actual_Sum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		int missingNumber=actual_Sum-sum;
		
		System.out.println("Missing number is: "+missingNumber);
		
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,7,8};
		findNumber(arr);
		
	}

}
