package CompanyQuestions;

import java.util.Arrays;

public class MissingNumber
{
	public static int findMissingNumber(int[] arr)
	{
		Arrays.sort(arr);
		int n=arr[arr.length-1];
		int totalSum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		int missingNumber=totalSum-sum;
		return missingNumber;
		
	}
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,5};
		System.out.println(findMissingNumber(arr));
	}

}
