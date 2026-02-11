package GeeksforGeeks;

import java.util.Arrays;

public class Sort0s1sAnd2s 
{
	public static void sort012(int[] arr)
	{
		int mid=0,low=0,high=arr.length-1,c;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[mid]==0)
			{
				c=arr[low];
				arr[low]=arr[mid];
				arr[mid]=c;
				low++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			else
			{
				c=arr[mid];
				arr[mid]=arr[high];
				arr[high]=c;
				high--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) 
	{
		int[] arr= {0,1,2,0,1,2};
		sort012(arr); //  [0, 0, 1, 1, 2, 2]

		int[] arr2= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sort012(arr2);  // [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
	}


}
