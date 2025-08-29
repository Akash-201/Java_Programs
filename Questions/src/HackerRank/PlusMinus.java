package HackerRank;

import java.util.Arrays;
import java.util.List;

public class PlusMinus 
{
	public static void plusMinus(List<Integer> arr)
	{
		double n=arr.size();
		int positive=0;
		int negative=0;
		int zero=0;
		
		for(int num : arr)
		{
			if(num>0)
			{
				positive++;
			}
			if(num<0)
			{
				negative++;
			}
			else
			{
				zero++;
			}
		}
		System.out.println(positive/n);
		System.out.println(negative/n);
		System.out.println(zero/n);
	}
	public static void main(String[] args) {
		List<Integer> arr= Arrays.asList(1,1,0,-1,-1);
		plusMinus(arr);
	}

}
