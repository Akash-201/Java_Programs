package CompanyQuestions;

import java.util.Arrays;

public class IndexesOfSubArraySum 
{
	public static int[] subArraySumPositive(int [] arr, int target)
	{
		int left=0;
		int sum=0;
		for(int right=0;right<arr.length;right++)
		{
			sum+=arr[right];
			while(sum>target && left<=right)
			{
				sum-=arr[left++];
			}
			if(sum==target)
			{
				return new int[]{left,right};
			}
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,7,5};
		int target=12;
		System.out.println(Arrays.toString(subArraySumPositive(arr, target)));
	}

}
