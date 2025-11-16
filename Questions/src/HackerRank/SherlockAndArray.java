package HackerRank;

import java.util.Arrays;
import java.util.List;

public class SherlockAndArray 
{
	public static String balancedSums(List<Integer> arr) 
	{
		int totalSum = 0;
        for (int x : arr) 
        {
            totalSum += x;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.size(); i++)
        {
            int current = arr.get(i);
            int rightSum = totalSum - leftSum - current;

            if (leftSum == rightSum)
            {
                return "YES";
            }

            leftSum += current;
        }

        return "NO";
	}
	public static void main(String[] args) 
	{
		List<Integer> arr=Arrays.asList(2,0,0,0);
		System.out.println(balancedSums(arr));
	}

}
