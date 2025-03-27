package Array;

public class FindMissingNumber2 
{
	public static int findMissingNumber(int[] arr,int n)
	{
		int totalSum=n*(n+1)/2;
		int sum=0;

		for(int num : arr)
		{
			sum=sum+num;
		}
		return totalSum-sum;

	}
	public static void main(String[] args)
	{
		int[] arr={1,2,3,5,6,7,8,9,10};
		int n=10;
		System.out.println("Missing Number Is: "+findMissingNumber(arr,n));

	}

}
