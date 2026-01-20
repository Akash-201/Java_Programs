package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNumbers 
{
	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr)
	{
		Collections.sort(arr);
		Collections.sort(brr);

		List<Integer> result = new ArrayList<>();

		int i = 0; // pointer for arr
		int j = 0; // pointer for brr

		while (j < brr.size())
		{

			if (i < arr.size() && arr.get(i).equals(brr.get(j))) 
			{
				i++;
				j++;
			} 
			else
			{
				// missing number found
				if (result.isEmpty() || !result.get(result.size() - 1).equals(brr.get(j))) 
				{
					result.add(brr.get(j));
				}
				j++;
			}
		}

		return result;
	}
	public static void main(String[] args)
	{
		List<Integer> arr=Arrays.asList(7,2,5,3,5,3);
		List<Integer> brr=Arrays.asList(7,2,5,4,6,3,5,3);
		System.out.println(missingNumbers(arr, brr));  // [4,6]

		List<Integer> arr2=Arrays.asList(203,204,205,206,207,208,203,204,205,206);
		List<Integer> brr2=Arrays.asList(203,204,204,205,206,207,205,208,203,206,205,206,204);

		System.out.println(missingNumbers(arr2, brr2));  // [204, 205, 206]


	}
}
