package Array;

import java.util.Arrays;

public class SortColor
{
	public static void sortColor(int[] arr)
	{
		int left=0;
		int right=arr.length-1;

		int i=0;
		while(i<=right)
		{
			if(arr[i]==0)
			{
				int temp=arr[left];
				arr[left]=arr[i];
				arr[i]=temp;
				left++;
				i++;
			}
			else if(arr[i]==2)
			{
				int temp=arr[right];
				arr[right]=arr[i];
				arr[i]=temp;
				right--;
			}
			else
			{
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		int[] arr= {2,0,2,1,1,0};
		sortColor(arr);	
	}

}
