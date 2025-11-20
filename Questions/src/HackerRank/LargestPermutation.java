package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargestPermutation 
{
	public static List<Integer> largestPermutation(int k, List<Integer> arr) 
	{
	int n = arr.size();

    Map<Integer, Integer> pos = new HashMap<>();
    for (int i = 0; i < n; i++) 
    {
        pos.put(arr.get(i), i);
    }

    for (int i = 0; i < n && k > 0; i++)
    {

        int target = n - i;  

        if (arr.get(i) == target) 
        {
            continue; 
        }

        int targetIndex = pos.get(target);

        int currentValue = arr.get(i);
        arr.set(i, target);
        arr.set(targetIndex, currentValue);

        pos.put(target, i);
        pos.put(currentValue, targetIndex);

        k--; 
    }

    return arr;
}
	public static void main(String[] args) 
	{
		List<Integer> arr=Arrays.asList(4, 2, 3, 5, 1);
		System.out.println(largestPermutation(1, arr));  // [5, 2, 3, 4, 1]
		
	}
}

