package HackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SalesByMatch 
{
	public static int sockMerchant(int n, List<Integer> ar) 
	{
		Collections.sort(ar);
		int pairs=0;
		for(int i=0;i<n-1;)
		{
			if(ar.get(i).equals(ar.get(i+1)))
			{
				pairs++;
				i+=2;
			}
			else{
				i++;
			}
		}
		return pairs;
	}
	public static void main(String[] args)
	{
		List<Integer> sockIntegers = Arrays.asList(10,20,20,10,10,30,50,10,20);
		System.out.println(sockMerchant(9, sockIntegers));

	}


}
