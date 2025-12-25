package LeetCode_Questions;

// LeetCode: 3074. Apple Redistribution into Boxes

import java.util.Arrays;

public class AppleRedistributionIntoBoxes3074
{
	public static int minimumBoxes(int[] apple, int[] capacity) 
	{
		Arrays.sort(capacity);
		int totalApple=0;
		for(int i=0;i<apple.length;i++)
		{
			totalApple=totalApple+apple[i];
		}
		int usedBoxes=0;
		int currentCapacity=0;

		for(int i=capacity.length-1;i>=0;i--)
		{
			currentCapacity += capacity[i];
			usedBoxes++;

			if (currentCapacity >= totalApple) 
			{
				return usedBoxes;
			}
		}
		return usedBoxes;

	}
	public static void main(String[] args)
	{
		int[] apple= {1,3,2};
		int[] capacity= {4,3,1,5,2};
		System.out.println(minimumBoxes(apple, capacity)); // 2

		int[] apple2= {5,5,5};
		int[] capacity2= {2,4,2,7};
		System.out.println(minimumBoxes(apple2, capacity2)); // 4

	}

}
