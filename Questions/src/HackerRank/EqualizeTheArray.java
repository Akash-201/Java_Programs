package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualizeTheArray 
{
	public static int equalizeArray(List<Integer> arr)
	{
	    Map<Integer, Integer> freq = new HashMap<>();

	        // Count frequency of each number
	        for (int num : arr) 
	        {
	            freq.put(num, freq.getOrDefault(num, 0) + 1);
	        }

	        // Find max frequency
	        int maxFreq = 0;
	        for (int count : freq.values()) 
	        {
	            maxFreq = Math.max(maxFreq, count);
	        }

	        // Elements to delete = total size - max frequency
	        return arr.size() - maxFreq;
	    }
	public static void main(String[] args) 
	{
		List<Integer> arr=Arrays.asList(3, 3, 2, 1, 3);
		System.out.println(equalizeArray(arr));  //2
		
		List<Integer> arr2=Arrays.asList(1,2,2,3);
		System.out.println(equalizeArray(arr2));  // 2
		
	}


}
