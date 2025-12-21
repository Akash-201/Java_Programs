package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SparseArrays
{
	public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) 
	{
		List<Integer> result=new ArrayList<>();
		for(int i=0;i<queries.size();i++)
		{
			int sum=0;
			for(int j=0;j<stringList.size();j++)
			{
				if(queries.get(i).equals(stringList.get(j)))
				{
					sum++;
				}
			}
			result.add(sum);
		}
		return result;

	}
	public static void main(String[] args)
	{
		List<String> stringList=Arrays.asList("aba","baba","aba","xzxb");
		List<String> queries=Arrays.asList("aba","xzxb","ab");
		System.out.println(matchingStrings(stringList, queries));


	}

}
