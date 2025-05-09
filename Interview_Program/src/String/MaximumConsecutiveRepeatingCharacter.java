package String;

//Given a string s, the task is to find the maximum consecutive repeating character in the string.

//Note: We do not need to consider the overall count, but the count of repeating that appears in one place.

//Examples: 

//Input: s = “geeekk”
//Output: e
//Explanation: character e comes 3 times consecutively which is maximum.

//Input: s = “aaaabbcbbb”
//Output: a
//Explanation: character a comes 4 times consecutively which is maximum.


public class MaximumConsecutiveRepeatingCharacter 
{
	public static void repeatingCharacter(String str)
	{
		char[] ch=str.toCharArray();
		char result = 0;
		int count=1;
		for(int i=0;i<ch.length;i++)
		{
			int localCount=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[j]!=ch[i])
				{
					break;
				}
				localCount++;
			}
			if(localCount>count)
			{
				count=localCount;
				result=ch[i];
			}
		}
		System.out.println(result);
		
	}
	public static void main(String[] args)
	{
		String str="aaaabbcbbb";
		repeatingCharacter(str);
	}

}
