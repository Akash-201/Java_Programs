package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMedian 
{
	public static int findMedian(List<Integer> arr) 
	{
		Collections.sort(arr);
		int n = arr.size();
		return arr.get(n / 2);
	}

	public static void main(String[] args) 
	{
		List<Integer> arr=Arrays.asList(5,3,1,2,4);
		System.out.println(findMedian(arr));

	}
}
