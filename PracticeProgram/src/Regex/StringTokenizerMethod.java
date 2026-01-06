package Regex;

import java.util.StringTokenizer;

public class StringTokenizerMethod 
{
	public static void printPattern(String str)
	{
		StringTokenizer st=new StringTokenizer(str,"-");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
	public static void main(String[] args) 
	{
//		printPattern("Durga Software Solution");
		printPattern("30-12-2025");
		
	}

}
