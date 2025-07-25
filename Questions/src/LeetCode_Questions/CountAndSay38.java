package LeetCode_Questions;



public class CountAndSay38 
{
	public static String countAndSay(int n)
	{
		if(n==1)
			return "1";

		String s=countAndSay(n-1);

		StringBuilder result=new StringBuilder();

		int i=0;
		while(i<s.length())
		{
			int count=1;

			while(i+1<s.length() && s.charAt(i)==s.charAt(i+1))
			{
				count++;
				i++;
			}
			result=result.append(count).append(s.charAt(i));
			i++;
		}
		return result.toString();
	}
	public static void main(String[] args)
	{
		int n=4;
		int n2=1;
		System.out.println(countAndSay(n)); // 1211
		System.out.println(countAndSay(n2)); // 1
	}

}
