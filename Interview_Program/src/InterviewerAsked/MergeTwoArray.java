package InterviewerAsked;

/* Both arrays may contains duplicates elements
Maintain ascending order
Remove duplicates
return the result as a single array
 */

import java.util.*;

public class MergeTwoArray 
{
	public static void mergeArray(int[] arr1,int[] arr2)
	{
		TreeSet<Integer> set=new TreeSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			set.add(arr1[i]);
		}

		for(int i=0;i<arr2.length;i++)
		{
			set.add(arr2[i]);
		}

		System.out.println(set); // [1, 2, 3, 4, 5, 6, 7]

	}
	public static void main(String[] args) 
	{
		int[] arr1= {1,2,3,4,4,5};
		int[] arr2= {2,3,5,6,7};
		mergeArray(arr1, arr2);

	}

}
