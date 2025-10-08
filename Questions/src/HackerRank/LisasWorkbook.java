package HackerRank;

import java.util.Arrays;
import java.util.List;

public class LisasWorkbook 
{
	public static int workbook(int n, int k, List<Integer> arr)
	{
		int page = 0;
		int special = 0;

		for (int i = 0; i < n; i++) 
		{
			int problems = arr.get(i);
			int probNumber = 1;

			while (probNumber <= problems) 
			{
				page++;
				int lastProbOnPage = Math.min(probNumber + k - 1, problems);

				for (int p = probNumber; p <= lastProbOnPage; p++)
				{
					if (p == page) 
					{
						special++;
					}
				}

				probNumber += k;
			}
		}

		return special;
	}
	public static void main(String[] args) 
	{
		List<Integer> arr= Arrays.asList(4,2,6,1,10);
		System.out.println(workbook(5,3,arr));  // 4
	}

}
