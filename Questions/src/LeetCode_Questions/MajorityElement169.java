package LeetCode_Questions;

public class MajorityElement169 
{
	   public static int majorityElement(int[] nums) 
	   {
		   int majorityCandidate=nums[0];
		   int count=1;
		   
		   for(int i=1;i<nums.length;i++)
		   {
			   if(nums[i]==majorityCandidate)
			   {
				   count++;
			   }
			   else
			   {
				   count--;
				   if(count==0)
				   {
					   majorityCandidate=nums[i];
					   count=1;
				   }
			   }
		   }
		   return majorityCandidate;
	   }
	   public static void main(String[] args)
	   {
		   int[] nums= {2,2,1,1,1,2,2};
		   System.out.println(majorityElement(nums));
		
	}
}
