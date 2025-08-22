package CompanyQuestions;

import java.util.Arrays;

public class ChildrensCookies 
{
	public static int findContentChildren(int[] g, int[] s)
	{
		Arrays.sort(g);
		Arrays.sort(s);
		
		int i=0;
		
		for(int j=0;i<g.length && j<s.length;j++)
		{
			if(g[i]<=s[j])
			{
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int[] g= {1,5,3,3,4};
		int[] s= {4,3,2,1,2,1};
		System.out.println(findContentChildren(g, s));
		
	}

}
