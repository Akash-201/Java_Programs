package Array;

import java.util.Arrays;

public class First_And_Second_largestElement 
{
	public static void firstAndSecondLargestElement(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("1st largest element: "+arr[arr.length-1]);
		System.out.println("2nd largest element: "+arr[arr.length-2]);
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,99,8,4,9,33,87,685,77,46};
		firstAndSecondLargestElement(arr);
	}

}
