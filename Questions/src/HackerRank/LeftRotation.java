package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotation 
{
	public static List<Integer> rotateLeft(int d, List<Integer> arr) 
	{
		int n=arr.size();
		d=d%n;

		List<Integer> result=new ArrayList<Integer>();
		for(int i=d;i<n;i++)
		{
			result.add(arr.get(i));
		}
		for(int i=0;i<d;i++)
		{
			result.add(arr.get(i));
		}
		return result;
	}
	public static void main(String[] args) 
	{
		int d=2;
		List<Integer> arr=Arrays.asList(1,2,3,4,5);
		System.out.println(rotateLeft(2, arr));
	}

}
