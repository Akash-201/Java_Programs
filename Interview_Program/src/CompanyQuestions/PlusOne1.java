package CompanyQuestions;

import java.util.Arrays;

// input: [1,2,3]
// output: [1,2,4]

// input: [4,3,2,1]
// output: [4,3,2,2]
// if last number is 9 then make its 0

public class PlusOne1
{
	public static void plusOne(int[] arr)
	{
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==9)
			{
				arr[i]=0;	
			}
			else
			{
				arr[i]=arr[i]+1;
			}
			break;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{
		int[] arr= {4,3,2,1};
		int[] arr2= {9,9,9};
		int[] arr3= {1,2,3};
		plusOne(arr); // [4,3,2,2]
		plusOne(arr2); // [9,9,0]
		plusOne(arr3); // [1,2,4]
		
	}

}
