package HackerRank;

import java.util.Arrays;
import java.util.List;

public class FairRations 
{
	public static String fairRations(List<Integer> B)
	{
	    int loaves = 0;
	    int n = B.size();

	    for (int i = 0; i < n - 1; i++)
	    {
	        if (B.get(i) % 2 != 0) 
	        {
	            // give one loaf to current and next person
	            B.set(i, B.get(i) + 1);
	            B.set(i + 1, B.get(i + 1) + 1);
	            loaves += 2;
	        }
	    }

	    // if last person has odd loaves, it's impossible
	    if (B.get(n - 1) % 2 != 0) 
	    {
	        return "NO";
	    }

	    return String.valueOf(loaves);
	}
	
	public static void main(String[] args)
	{
		List<Integer> B=Arrays.asList(2,3,4,5,6);
		System.out.println(fairRations(B));
		
		List<Integer> B2=Arrays.asList(1,2);  // 4
		System.out.println(fairRations(B2));  // NO
		
	}


}
