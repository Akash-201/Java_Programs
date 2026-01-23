package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PermutingTwoArrays 
{
	public static String twoArrays(int k, List<Integer> A, List<Integer> B) 
	{

		Collections.sort(A);
		Collections.sort(B,Collections.reverseOrder());

		for(int i=0;i<A.size();i++)
		{
			for(int j=i;j<=i;j++)
			{
				if(!(A.get(i)+B.get(j)>=k))
				{
					return "NO";
				}
			}
		}
		return "YES";

	}
	public static void main(String[] args) 
	{
		List<Integer> A=Arrays.asList(0,1);
		List<Integer> B=Arrays.asList(0,2);
		System.out.println(twoArrays(1, A, B));  // YES

		List<Integer> A2=Arrays.asList(2,1,3);
		List<Integer> B2=Arrays.asList(7,8,9);
		System.out.println(twoArrays(10, A2, B2));  // YES

		List<Integer> A3=Arrays.asList(1,2,2,1);
		List<Integer> B3=Arrays.asList(3,3,3,4);
		System.out.println(twoArrays(5,A3,B3));  // NO
	}

}
