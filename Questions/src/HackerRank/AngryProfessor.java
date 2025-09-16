package HackerRank;

import java.util.Arrays;
import java.util.List;

public class AngryProfessor 
{
	public static String angryProfessor(int k, List<Integer> a)
	{
		int cancel=0;
		int starts=0;
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)<=0)
			{
				starts++;
			}
			else
			{
				cancel++;
			}
		}
		if(k>starts)
		{
			return "YES";
		}
		return "NO";

	}
	public static void main(String[] args) 
	{
		int k=3;
		List<Integer> a=Arrays.asList(-1,-3,4,2);
		System.out.println(angryProfessor(k, a));  // YES

		int k2=2;
		List<Integer> a2=Arrays.asList(0,-1,2,1);
		System.out.println(angryProfessor(k2, a2));  // NO
	}


}
