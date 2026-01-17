package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers 
{
	public static List<Integer> closestNumbers(List<Integer> arr) 
	{
		Collections.sort(arr);

		int minDiff=Integer.MAX_VALUE;

		List<Integer> result=new ArrayList<>();

		for(int i=0;i<arr.size()-1;i++)
		{
			int diff=arr.get(i+1)-arr.get(i);
			minDiff=Math.min(diff,minDiff);
		}

		for(int i=0;i<arr.size()-1;i++)
		{
			if(arr.get(i+1)-arr.get(i)==minDiff)
			{
				result.add(arr.get(i));
				result.add(arr.get(i+1));
			}
		}
		return result;
	}
	public static void main(String[] args) 
	{

		List<Integer> arr1=Arrays.asList(5,4,3,2);
		System.out.println(closestNumbers(arr1)); // [2, 3, 3, 4, 4, 5]

		List<Integer> arr2=Arrays.asList(-20, -3916237, -357920, -3620601, 7374819,
				-7330761, 30, 6246457, -6461594, 266854);
		System.out.println(closestNumbers(arr2));  // [-20, 30]

		List<Integer> arr3=Arrays.asList(-20, -3916237, -357920, -3620601, 7374819 ,
				-7330761, 30, 6246457, -6461594, 266854, -520, -470 );
		System.out.println(closestNumbers(arr3));  // [-520, -470, -20, 30]




	}

}
