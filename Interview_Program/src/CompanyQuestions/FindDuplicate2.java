package CompanyQuestions;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate2 
{
	public static void printDuplicate(int[] arr)
	{
		Set<Integer> nums=new HashSet<>();
		Set<Integer> printed=new HashSet<>();

		for(int i=0;i<arr.length;i++)
		{
			if(!nums.contains(arr[i]))
			{
				nums.add(arr[i]);
			}
			else if(!printed.contains(arr[i]))
			{
				System.out.print(arr[i]+" ");
				printed.add(arr[i]);

			}

		}
	}
	public static void main(String[] args)
	{
		int[] arr= {2,5,3,7,3,2,9,23,3};
		printDuplicate(arr);
	}

}
