package ForPracticePurpose;
// input: a2b3c4
// output: aabbbcccc

public class StringPattern1
{
	public static void pattern(String str)
	{
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) 
		{
//			if((ch[i]>=97 && ch[i]<=122) || (ch[i]>=65 && ch[i]<=90))
			if(Character.isLetter(ch[i]))
			{
				System.out.print(ch[i]);
				
			}
			else
			{
				int count = ch[i]-'0';
				for(int j=1;j<count;j++)
				{
					System.out.print(ch[i-1]);
				}
			}
			
			
		}
		
	}
	public static void main(String[] args)
	{
		String str="a2b3c4D5";
		pattern(str);
	}

}
