package CompanyAsked;

public class N_RepeatedElementInSize2N_Array961
{
	public static int repeatedNTimes(int[] nums) 
	{
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==-1)
				continue;

			int count=1;
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]==nums[j])
				{
					count++;
					nums[j]=-1;
				}
			}
			if(count>1)
				return nums[i];

		}
		return 0;
	}
	public static void main(String[] args)
	{
		int[] nums= {1,2,3,3};
		int[] nums2= {2,1,2,5,3,2};
		int[] nums3= {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(nums));
		System.out.println(repeatedNTimes(nums2));
		System.out.println(repeatedNTimes(nums3));
		
	}

}
