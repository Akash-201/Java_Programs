package InterviewerAsked;

public class OccurrenceOfConsecutiveCharacters 
{
	public static String findOccurrence(String s)
	{
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<s.length())
		{
			int count=0;
			char current=s.charAt(i);

			while(i<s.length() && s.charAt(i)==current)
			{
				count++;
				i++;
			}
			sb.append(current);			
			sb.append(count);			
		}
		return sb.toString();
	}
	public static void main(String[] args) 
	{
		System.out.println(findOccurrence("aabcccccaaa"));  // a2b1c5a3
		System.out.println(findOccurrence("bcccaaafddgb"));  // b1c3a3f1d2g1b1

	}

}
