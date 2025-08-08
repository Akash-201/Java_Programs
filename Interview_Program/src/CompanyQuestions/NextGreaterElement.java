package CompanyQuestions;

/* Given an array of integers, for each element in the array, find the next greater element to its right.
If no such element exists, return -1 for that position.
*/

import java.util.Arrays;

public class NextGreaterElement 
{
	public static void findGreaterElement(int[] arr)
	{
		int[] newArr=new int[arr.length];

		for(int i=0;i<arr.length;i++)
		{
			boolean found=false;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					newArr[i]=arr[j];
					found=true;
					break;
				}
			}
			if(!found)
			{
				newArr[i]=-1;
			}
		}
		System.out.println(Arrays.toString(newArr));

	}
	public static void main(String[] args) {
		int[] arr= {2,5,3,1,2,4,6};
		findGreaterElement(arr);
	}

}
