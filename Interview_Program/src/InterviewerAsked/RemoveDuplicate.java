package InterviewerAsked;

import java.util.ArrayList;

public class RemoveDuplicate 
{
	public static void removeDuplicate(int[] arr1,int[] arr2)
	{
		ArrayList<Integer> uniqueElement=new ArrayList<>();

		for(int num : arr1)
		{
			if(!uniqueElement.contains(num))
			{
				uniqueElement.add(num);
			}
		}

		for(int num : arr2)
		{
			if(!uniqueElement.contains(num))
			{
				uniqueElement.add(num);
			}
		}

		System.out.print("Unique Elements: ");
		for(int num: uniqueElement)
		{
			System.out.print(num+" ");
		}

	}
	public static void main(String[] args)
	{
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {6,3,4,7,8,9};
		removeDuplicate(arr1, arr2);
	}

}
