package String.programs;
// input: aabbbcccc
// output: a2b3c4
public class Pattern1
{
	public static void countPattern(String str)
	{
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length()-1;i++)
		{
			if(ch[i]==' ')
			
				continue;
			int count=1;
			for(int j=i+1;j<str.length();j++)
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
	public static void main(String[] args) {
		String str="aabbbcccc";
		countPattern(str);
	}
	

}
