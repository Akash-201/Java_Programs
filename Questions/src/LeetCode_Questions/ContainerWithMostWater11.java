package LeetCode_Questions;

// LeetCode: 11. Container With Most Water

public class ContainerWithMostWater11
{
	public static int maxArea(int[] height) 
	{
		int n = height.length;
		int maxWater = 0;

		int lp = 0;
		int rp = n - 1;

		while (lp < rp) 
		{
			int width = rp - lp;
			int minHeight = Math.min(height[rp], height[lp]);
			int water = minHeight * width;
			maxWater = Math.max(maxWater, water);

			if (height[lp] < height[rp])
			{
				lp += 1;
			} 
			else
			{
				rp -= 1;
			}
		}

		return maxWater;

	}
	public static void main(String[] args)
	{
		int[] height= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));  // 49

		int[] height2= {1,1};
		System.out.println(maxArea(height2)); // 1

	}

}
