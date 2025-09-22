package LeetCode_Questions;

import java.util.HashMap;
import java.util.Map;

public class ElementsWithMaximumFrequency3005 
{
	public static int maxFrequencyElements(int[] nums) 
	{
		Map<Integer, Integer> freq = new HashMap<>();
		int maxFreq =0;

		for (int num : nums) {
			int count = freq.getOrDefault(num, 0) + 1;
			freq.put(num, count);
			maxFreq = Math.max(maxFreq, count);
		}

		int result = 0;
		for (int value : freq.values()) {
			if (value == maxFreq) {
				result += value;
			}
		}

		return result;
	}
	public static void main(String[] args) {
		int[] nums= {1,2,2,3,1,4};
		System.out.println(maxFrequencyElements(nums));
	}

}
