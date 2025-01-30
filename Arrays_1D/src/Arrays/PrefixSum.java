package Arrays;

//Input: arr[] = {10, 20, 10, 5, 15}
//Output: prefixSum[] = {10, 30, 40, 45, 60}

public class PrefixSum 
{
	public static void prefixSum(int[] arr)
	{
		int[] newArr=new int[arr.length];

		for(int i=0;i<=arr.length-1;i++)
		{
			int sum=0;
			for(int j=0;j<=i;j++)
			{
				sum=sum+arr[j];

			}
			newArr[i]=sum;
		}
		for(int ele : newArr)
		{
			System.out.print(ele+" ");
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] arr= {10, 20, 10, 5, 15};
		prefixSum(arr);
		
		
		
	}

}
