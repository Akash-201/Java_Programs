package CompanyQuestions;

/*
Given two integer arrays, childrenGreed[] (greed factors of children) and cookieSizes[] (sizes of cookies), 
write a program to find the maximum number of children who can be content if each child gets at most one cookie,
 and a cookie can only satisfy a child if its size ≥ the child’s greed.
 */

import java.util.Arrays;

public class CookieDistribution 
{
	public static int countContentChildren(int[] childrenGreed, int[] cookieSizes)
	{
		Arrays.sort(childrenGreed);
		Arrays.sort(cookieSizes);

		int childIndex=0;

		for (int cookieIndex = 0; childIndex < childrenGreed.length && cookieIndex < cookieSizes.length; cookieIndex++) {
			if (childrenGreed[childIndex] <= cookieSizes[cookieIndex]) {
				childIndex++;
			}
		}
		return childIndex;
	}
	public static void main(String[] args) {
		int[] childIndex= {1,5,3,3,4};
		int[] cookieSizes= {4,3,2,1,2,1};
		System.out.println(countContentChildren(childIndex,cookieSizes));

	}

}
