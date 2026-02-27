package LeetCode_Questions;

// Leetcode:- 551. Student Attendance Record I

public class StudentAttendanceRecord_I_551
{
	public static boolean checkRecord(String s) 
	{
		char[] ch=s.toCharArray();
		int absent=0;

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='A') absent++; 
			if(ch[i]=='L') 
			{
				int late=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[j]==ch[j-1])
					{
						late++;
					}
					else
					{
						break;
					}

					if(late>=3) return false;
				}
			}
		}
		if(absent>1) return false;
		return true;
	}
	public static void main(String[] args)
	{
		System.out.println(checkRecord("PPALLP"));  // true
		System.out.println(checkRecord("PPALLL"));  // false
	}
}
