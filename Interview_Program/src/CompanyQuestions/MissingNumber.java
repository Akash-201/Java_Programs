package CompanyQuestions;

/*   Given an array of n integers containing numbers from 0 to n (inclusive) with one number missing, 
write a program to find the missing number.
*/

import java.util.Arrays;

public class MissingNumber
{
	public static int findMissingNumber(int[] arr)
	{
		int n=arr.length;
		int totalSum=n*(n+1)/2;
		int sum=0;
		for(int num : arr)
		{
			sum+=num;
		}
		return totalSum-sum;
		
		
	}
	public static void main(String[] args) {
		int[] arr= {0,1,2,3,5};
		System.out.println(findMissingNumber(arr));
	}

}
