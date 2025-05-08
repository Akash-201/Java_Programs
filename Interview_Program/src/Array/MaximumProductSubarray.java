package Array;
//Given an integer array, the task is to find the maximum product of any subarray.

//Examples:

//Input: arr[] = {-2, 6, -3, -10, 0, 2}
//Output: 180
//Explanation: The subarray with maximum product is {6, -3, -10} with product = 6 * (-3) * (-10) = 180


//Input: arr[] = {-1, -3, -10, 0, 60}
//Output: 60
//Explanation: The subarray with maximum product is {60}.

public class MaximumProductSubarray
{
	 public static void maximumproduct(int[] arr)
	 {
		 int finalProduct=Integer.MIN_VALUE;
		 for(int i=0;i<arr.length;i++)
		 {
			 int initialproduct=1;
			 for(int j=i;j<arr.length;j++)
			 {
				 initialproduct*=arr[j];
				 if(finalProduct<=initialproduct)
				 {
					 finalProduct=initialproduct;
				 }
			 }
		 }
		 System.out.println(finalProduct);
	 }
	 public static void main(String[] args)
	 {
		 int[] arr= {-2, 6, -3, -10, 0, 2};
		 maximumproduct(arr);
	 }

}
