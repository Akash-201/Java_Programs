package HackerRank;

import java.util.Arrays;
import java.util.List;

public class MigratoryBirds 
{
	public static int migratoryBirds(List<Integer> arr) 
	{
		int[] freq = new int[5]; 
		for (int bird : arr)
		{
			freq[bird - 1]++; 
		}
		int maxFreq = 0;
		int birdType = 1; 

		for (int i = 0; i < 5; i++) 
		{
			if (freq[i] > maxFreq) 
			{
				maxFreq = freq[i];
				birdType = i + 1;
			}
		}
		return birdType;
	}
	public static void main(String[] args) 
	{
		List<Integer> arr=Arrays.asList(1,4,4,4,5,3);
		List<Integer> arr2=Arrays.asList(1,2,3,4,5,4,3,2,1,3,4);

		System.out.println(migratoryBirds(arr));  //4
		System.out.println(migratoryBirds(arr2)); // 3


	}
}
