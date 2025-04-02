package CompanyQuestions;

import java.util.ArrayList;

public class RemoveElement 
{
	public static ArrayList<Integer> removeElement(int[] arr, int val)
	{
		ArrayList<Integer> remaining=new ArrayList<>();
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]!=val)
			{
				remaining.add(arr[i]);
			}
			
		}
		return remaining;
	}
	public static void main(String[] args)
	{
		int[] arr= {0,1,2,2,3,0,4,2};
		int val=2;
		System.out.println(removeElement(arr, val));
	}

}
