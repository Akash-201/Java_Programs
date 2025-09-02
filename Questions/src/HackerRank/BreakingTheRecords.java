package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords 
{
	public static List<Integer> breakingRecords(List<Integer> scores) {
		int max_count=0;
		int min_count=0;
		int max_value=scores.get(0);
		int min_value=scores.get(0);

		for(int i=1;i<scores.size();i++)
		{
			int value=scores.get(i);
			if(value>max_value)
			{
				max_value=value;
				max_count++;
			}
			if(value<min_value)
			{
				min_value=value;
				min_count++;
			}
		}
		ArrayList<Integer> num=new ArrayList<>();
		num.add(max_count);
		num.add(min_count);
		return num;
	}
	public static void main(String[] args)
	{
		List<Integer> scores=Arrays.asList(10,5,20,20,4,5,2,25,1);  
		List<Integer> scores2=Arrays.asList(3,4,21,36,10,28,35,5,24,42);
		System.out.println(breakingRecords(scores));  // [2, 4]
		System.out.println(breakingRecords(scores2)); // [4, 0]
	}


}
