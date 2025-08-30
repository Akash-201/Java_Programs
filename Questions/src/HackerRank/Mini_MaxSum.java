package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mini_MaxSum 
{
	public static void miniMaxSum(List<Integer> arr)
	{
		Collections.sort(arr);
		long min=0;
		long max=0;
		
		for(int i=0;i<arr.size()-1;i++)
		{
			min+=arr.get(i);
			
		}
		for(int i=1;i<arr.size();i++)
		{
			max+=arr.get(i);
			
		}
		System.out.println(min+" "+max);
	}
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(1,3,5,7,9);  // 16 24
		List<Integer> arr2=Arrays.asList(1,2,3,4,5); // 10 14
		miniMaxSum(arr);
		miniMaxSum(arr2);
	}

}
