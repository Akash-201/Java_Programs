package LeetCode_Questions;

public class NumberOfZero_FilledSubarrays2348 
{
	public static long zeroFilledSubarray(int[] nums) 
	{
		long result=0;
		long count=0;
		for(int num : nums)
		{
			if(num==0)
			{
				count+=1;
				result+=count;
			}
			else {
				count=0;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums= {1,3,0,0,2,0,0,4};
		System.out.println(zeroFilledSubarray(nums));
		
	}

}
