package HackerRank;

public class AppendAndDelete 
{
	public static String appendAndDelete(String s, String t, int k)
	{
		int commonLength = 0;

		// Find common prefix length
		for (int i = 0; i < Math.min(s.length(), t.length()); i++)
		{
			if (s.charAt(i) == t.charAt(i))
			{
				commonLength++;
			} 
			else
			{
				break;
			}
		}

		int deletions = s.length() - commonLength;
		int appends = t.length() - commonLength;
		int totalOps = deletions + appends;

		//  If we have enough ops to delete entire string and rebuild
		if (k >= s.length() + t.length())
		{
			return "Yes";
		}

		//  If exact match possible
		if (totalOps <= k && (k - totalOps) % 2 == 0) 
		{
			return "Yes";
		}

		return "No";
	}
	public static void main(String[] args) 
	{
		System.out.println(appendAndDelete("hackerhappy","hackerrank",9));  // Yes
		System.out.println(appendAndDelete("aba", "aba",7));  // Yes
		System.out.println(appendAndDelete("ashley", "ash",2)); // No
	}
}
