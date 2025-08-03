package Arrays;

/* A leader in an array is an element that is greater than or equal to all the elements to its right.

In an array arr[], an element arr[i] is a leader if:

arr[i] >= arr[i+1], arr[i+2], ..., arr[n-1]
The rightmost element is always a leader, because there are no elements to its right.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leader_Number
{
	public static void printLeaderNumber(int[] arr)
	{
		int n=arr.length;
		int maxRight=arr[n-1];

		// it prints the leaders in reverse order (right to left)
		/*		System.out.println(maxRight);
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>maxRight)
			{
				maxRight=arr[i];
				System.out.println(maxRight);
			}
		}
		 */

		//		print the leaders in original (left-to-right) order
		List<Integer> leaders=new ArrayList<>();
		leaders.add(maxRight);
		for(int i=n-2;i>=0;i--)
		{
			if(arr[i]>maxRight)
			{
				maxRight=arr[i];
				leaders.add(maxRight);
			}
		}
		Collections.reverse(leaders);
		for(int leader : leaders)
		{
			System.out.print(leader+" ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr= {16,17,4,3,5,2};
		printLeaderNumber(arr);
	}
}
