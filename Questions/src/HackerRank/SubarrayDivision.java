package HackerRank;

import java.util.Arrays;
import java.util.List;

public class SubarrayDivision 
{
	public static int birthday(List<Integer> s, int d, int m)
	{
		int ans=0;
		for(int i=0;i<=s.size()-m;i++)
		{
			int sum=0;
			for(int j=i;j<i+m;j++)
			{
				sum=sum+s.get(j);
			}
			if(sum==d)
			{
				ans++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(2,2,1,3,2);
		List<Integer> s2=Arrays.asList(1,2,1,3,2);
		List<Integer> s3=Arrays.asList(1,1,1,1,1,1);
		
		System.out.println(birthday(s,4,2)); // 2
		System.out.println(birthday(s2,3,2)); // 2
		System.out.println(birthday(s3,3,2)); // 0
	}

}
