package CompanyQuestions;

/* Given an array of size n containing numbers from 1 to (n+1) with exactly one number missing,
find the missing number.

Example:

Input:  [1, 2, 3, 4, 5, 7]
Output: 6

 */

public class MissingNumber2
{
	public static int findMissingNumber(int[] arr)
	{
		int n=arr.length;
		int totalSum=(n+1)*(n+2)/2;

		int currentSum=0;

		for(int val : arr)
		{
			currentSum+=val;
		}
		return totalSum-currentSum;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,7};
		System.out.println(findMissingNumber(arr));
	}

}
