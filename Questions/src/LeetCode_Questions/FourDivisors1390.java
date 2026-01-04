package LeetCode_Questions;

// LeetCode: 1390. Four Divisors

public class FourDivisors1390 
{
	public static int sumFourDivisors(int[] nums) 
	{
		int totalSum=0;
		for(int num : nums)
		{
			int sum=0;
			int count=0;

			for(int i=1;i*i<=num;i++)
			{
				if(num%i==0)
				{
					int other=num/i;

					if(i==other)
					{
						count+=1;
						sum+=i;
					}
					else
					{
						count+=2;
						sum=sum+i+other;
					}
				}
				if(count>4)
				{
					break;
				}
			}
			if(count==4)
			{
				totalSum+=sum;
			}
		}
		return totalSum;
	}
	public static void main(String[] args)
	{
		int[] nums= {21,4,7};
		System.out.println(sumFourDivisors(nums));  // 32

		int[] nums2= {21,21};
		System.out.println(sumFourDivisors(nums2));  // 64

		int[] nums3= {1,2,3,4,5};
		System.out.println(sumFourDivisors(nums3));  // 0

	}

}
