package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents 
{
	public static List<Integer> gradingStudents(List<Integer> grades)
	{
		List<Integer> res = new ArrayList<>(grades.size());
		for (int g : grades) 
		{
			if (g < 38) 
			{
				res.add(g);
			} else 
			{
				int next5 = ((g / 5) + 1) * 5;
				if (next5 - g < 3) res.add(next5);
				else res.add(g);
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		List<Integer> grades=Arrays.asList(4,73,67,38,33);
		System.out.println(gradingStudents(grades));
		
	}

}
