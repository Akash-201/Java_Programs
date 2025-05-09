package String;


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
