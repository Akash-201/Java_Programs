package ForPracticePurpose;



public class StringPattern3
{
	public static void printPattern(String str)
	{
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
				continue;
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=' ';
				}
			}
			if(count>1)
			{
				System.out.print(ch[i]+""+count);
			}
			else
			{
				System.out.print(ch[i]);
			}
		}
		
	}
	public static void main(String[] args)
	{
		String str="aaabbcdd";
		printPattern(str);
	}
	

}
