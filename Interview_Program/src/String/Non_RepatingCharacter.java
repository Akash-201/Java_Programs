package String;

public class Non_RepatingCharacter
{
	public static void nonRepatingCharcter(String str)
	{
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && i!=j)
				{
				count++;
				}
			}
			if(count==0)
			{
				System.out.print(ch[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		nonRepatingCharcter("Hello");
	}

}
