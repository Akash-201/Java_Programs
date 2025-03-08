package String;

public class CountWord 
{
	public static void countWord(String s1)
	{
		String[] s2=s1.trim().split("\\s+");  // Splitting using one or more spaces
		int count=0;
		for(int i=0;i<s2.length;i++)
		{
			count++;
		}
		System.out.println(count);
		
	}
	public static void main(String[] args)
	{
		String s1="Hello  World";
		countWord(s1);
		
	}

}
