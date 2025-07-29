package LeetCode_Questions;

//Leetcode: 27. Remove Element

public class RemoveElement27 
{
	 public static int removeElement(int[] nums, int val)
	 {
		 int i=0;
		 for(int j=0;j<nums.length;j++)
		 {
			 if(nums[j]!=val)
			 {
				 nums[i]=nums[j];
				 i++;
			 }
		 }
		 return i;
	 }
	 public static void main(String[] args)
	 {
		 int[] nums= {0,1,2,2,3,0,4,2};
		 int[] nums2= {3,2,2,3};
		 int val=2;
		 int val2=3;
		 System.out.println(removeElement(nums, val));   // 5
		 System.out.println(removeElement(nums2, val2)); // 2
	 }

}
