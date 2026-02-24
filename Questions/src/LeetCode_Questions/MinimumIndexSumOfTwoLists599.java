package LeetCode_Questions;

// Leetcode:- 599. Minimum Index Sum of Two Lists

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexSumOfTwoLists599 
{
	public static String[] findRestaurant(String[] list1, String[] list2) 
	{
		List<String> result = new ArrayList<>();
		int minSum = Integer.MAX_VALUE;

		for (int i = 0; i < list1.length; i++) 
		{
			for (int j = 0; j < list2.length; j++) 
			{

				if (list1[i].equals(list2[j]))
				{
					int sum = i + j;

					if (sum < minSum) 
					{
						result.clear();
						result.add(list1[i]);
						minSum = sum;
					}
					else if (sum == minSum)
					{
						result.add(list1[i]);
					}
				}
			}
		}

		return result.toArray(new String[0]);
	}
	public static void main(String[] args) 
	{
		String[] list1= {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2= {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		System.out.println(Arrays.toString(findRestaurant(list1, list2)));  // [Shogun]

		String[] list3= {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list4= {"KFC","Shogun","Burger King"};
		System.out.println(Arrays.toString(findRestaurant(list3, list4)));  // [Shogun]

		String[] list5= {"happy","sad","good"};
		String[] list6= {"sad","happy","good"};
		System.out.println(Arrays.toString(findRestaurant(list5, list6)));  // [happy, sad]

	}

}
