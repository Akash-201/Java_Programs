package HackerRank;

public class HackerRankIn_A_String 
{
	public static String hackerrankInString(String s) 
	{
	      String target = "hackerrank";
	        int j = 0;

	        for (int i = 0; i < s.length() && j < target.length(); i++) 
	        {
	            if (s.charAt(i) == target.charAt(j)) 
	            {
	                j++;
	            }
	        }
	        return (j == target.length()) ? "YES" : "NO";
	    }
	
	public static void main(String[] args) 
	{
		String s="hereiamstackerrank";
		System.out.println(hackerrankInString(s));  // YES
		
		String s2="hackerworld";
		System.out.println(hackerrankInString(s2));  // NO
		
	}

}
