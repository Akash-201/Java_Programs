package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_DS
{
	public static List<Integer> reverseArray(List<Integer> a)
	{
//		Collections.reverse(a);
//		return a;
		
		List<Integer> reverseList=new ArrayList<Integer>();
		for(int i=a.size()-1;i>=0;i--)
		{
			reverseList.add(a.get(i));
		}
		return reverseList;
		
	}
	public static void main(String[] args) 
	{
		List<Integer> a=Arrays.asList(1,2,3);
		System.out.println(reverseArray(a));
		
	}

}
