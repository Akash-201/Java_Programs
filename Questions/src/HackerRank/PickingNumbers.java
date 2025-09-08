package HackerRank;

import java.util.Arrays;
import java.util.List;

public class PickingNumbers
{
	public static int pickingNumbers(List<Integer> a) 
	{
		int[] frequency = new int[101]; // as numbers are between 0 and 100

		// Count frequency of each number
		for(int num : a) 
		{
			frequency[num]++;
		}

		int max = 0;

		// Check the sum of each number with the next one
		for(int i = 0; i < 100; i++) 
		{
			max = Math.max(max, frequency[i] + frequency[i + 1]);
		}

		return max;
	}
	public static void main(String[] args) 
	{
		List<Integer> a=Arrays.asList(4,6,5,3,3,1);
		List<Integer> b=Arrays.asList(1,2,2,3,1,2);
		
		System.out.println(pickingNumbers(a)); //3
		System.out.println(pickingNumbers(b)); // 5
		
		
	}

}
