package InterviewerAsked;

// From a given string s, remove the string t every time it occurs.
// Continue this process until no occurrence of t is left, 
// and output the remaining string.”

//Example:
//Input: s = abababa, t = aba
//Output: b

public class RemoveAllOccurrences 
{
	public static void removeSubString(String s, String t)
	{
		while(s.contains(t))
		{
			s=s.replace(t,"");
		}
		System.out.println(s);
	}
	public static void main(String[] args) {
		removeSubString("abcabca","abca");
	}

}
