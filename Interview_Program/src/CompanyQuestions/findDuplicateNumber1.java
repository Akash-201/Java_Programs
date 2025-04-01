package CompanyQuestions;

import java.util.ArrayList;
import java.util.HashSet;

public class findDuplicateNumber1 
{
	public static ArrayList<Integer> findDuplicateNumber(int[] arr)
	{
		HashSet<Integer> elem = new HashSet<>();
		ArrayList<Integer> duplicates= new ArrayList();
		
		for(int i=0;i<arr.length;i++)
		{
			if(elem.contains(arr[i]))
			{
				duplicates.add(arr[i]);
			}
			elem.add(arr[i]);
		}
		return duplicates;
	}
	public static void main(String[] args)
	{
		int[] arr= {1,3,4,2,2,4};
		int[] arr1= {3,1,3,4,2};
		System.out.println(findDuplicateNumber(arr));
		System.out.println(findDuplicateNumber(arr1));
		
		
	}

}
