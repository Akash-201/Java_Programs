package Arrays;

//return true if sum of array element are equal to sum of odd element

public class ArraySumCheck 
{
	public static boolean check(int[] arr)
	{
		int totalSum=0;
		int oddSum=0;
		for(int i=0;i<arr.length;i++)
		{
			totalSum+=arr[i];
			if(arr[i]%2!=0)
			{
				oddSum+=arr[i];
			}
		}
		return totalSum == oddSum;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,3,5};
		int[] arr1= {1,2,3,4};
		System.out.println(check(arr));
		System.out.println(check(arr1));
		
	}

}
