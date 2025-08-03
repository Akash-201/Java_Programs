package Arrays;

public class Leader_Number
{
	public static void printLeaderNumber(int[] arr)
	{
		int n=arr.length;
		int maxRight=arr[n-1];
		
		System.out.println(maxRight);
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>maxRight)
			{
				maxRight=arr[i];
				System.out.println(maxRight);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr= {16,17,4,3,5,2};
		printLeaderNumber(arr);
	}
}
