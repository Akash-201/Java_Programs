package LeetCode_Questions;

public class FindMostFrequentVowelAndConsonant3541 
{
	public static int maxFreqSum(String s) 
	{
		int mv = 0;
		int mc = 0;
		int[] freq = new int[26];
		int n = s.length();
		for(int i=0;i<n;i++)
		{
			char c = s.charAt(i);
			freq[c - 'a']++;
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			{
				mv = Math.max(mv, freq[c-'a']);
			}else{
				mc = Math.max(mc, freq[c-'a']);
			}
		}
		return mv + mc;
	}
public static void main(String[] args) {
	String s="successes";
	System.out.println(maxFreqSum(s));
}

}
