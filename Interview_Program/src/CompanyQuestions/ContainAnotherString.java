package CompanyQuestions;


public class ContainAnotherString 
{
	public static int firstccurrence(String str1,String str2)
	{
		
		if(str1.contains(str2))
		{
			return 0;
		}
		return -1;
	}
	public static void main(String[] args)
	{
		String str1="sadbutsad";
		String str2="sad";
		String str3="leetcode";
		String str4="leeto";
		System.out.println(firstccurrence(str1, str2)); // 0
		System.out.println(firstccurrence(str3, str4)); // -1
		
	}

}
