package _4CECloudLabs;

public class CountFrequency
{
	public static void print(String str)
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
			System.out.println(ch[i]+" ---> "+count);
			
		}
	}
	public static void main(String[] args) {
		String str="Hello";
		print(str);
	}

}
