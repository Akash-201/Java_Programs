package ForPracticePurpose;

//input: aabbbcccc
//output: a2b3c4

public class StringPattern2 
{
	public static void pattern(String str)
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
			System.out.print(ch[i]+""+count);
		}
		
	}
	public static void main(String[] args)
	{
		String str="aabbbccccd";
		pattern(str);
	}

}
