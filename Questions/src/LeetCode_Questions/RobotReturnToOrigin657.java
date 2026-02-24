package LeetCode_Questions;

// Leetcode:- 657. Robot Return to Origin

public class RobotReturnToOrigin657
{
	public static  boolean judgeCircle(String moves) 
	{
		if(moves.length()==1) return false;
		if((moves.length()==2) && (moves.charAt(0)==moves.charAt(1)))
			return false;

		int u=0,d=0,l=0,r=0;

		for(int i=0;i<moves.length();i++)
		{
			if(moves.charAt(i)=='U')
			{
				u++;
			}
			else if(moves.charAt(i)=='D')
			{
				d++;
			}
			else if(moves.charAt(i)=='R')
			{
				r++;
			}
			else
			{
				l++;
			}
		}
		return r == l && u == d;
	}
	public static void main(String[] args) 
	{
		System.out.println(judgeCircle("UD")); // true
		System.out.println(judgeCircle("LL")); // false

	}

}
