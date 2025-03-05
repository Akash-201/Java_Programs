package String;

public class RemoveDuplicate
{
	public static void removeDuplicate(String str)
	{
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		String str2="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
			
				continue;
			}
			
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && i!=j)
				{
					ch[j]=' ';
				}
			}
			str2=str2+ch[i];
		}
		System.out.println(str2);
		
	}
	public static void main(String[] args) {
		String str="programming";
		removeDuplicate(str);
	}


}
