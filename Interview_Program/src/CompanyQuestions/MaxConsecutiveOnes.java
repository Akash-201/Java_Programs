package CompanyQuestions;



public class MaxConsecutiveOnes
{
	public static int maxConsecutiveOnes(int[] nums)
	{
		int answer=0;
		int count=0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0)
			{
				count=0;
			}
			else
			{
				count++;
			}
			if(count>answer)
			{
				answer=count;
			}
		}
		return answer;
	}
	public static void main(String[] args)
	{
		int[] nums = {1,1,0,1,1,1};
		int[] nums2 = {1,0,1,1,0,1};
		System.out.println(maxConsecutiveOnes(nums));
		System.out.println(maxConsecutiveOnes(nums2));
	}
	

}
