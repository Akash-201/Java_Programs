package String;

public class MostFrequentCharacter 
{
	public static void mostFrequentCharacter(String str)
	{
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		int maxCount=0;
		char maxChar=' ';
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			
				continue;
			
			int count=1;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && i!=j)
				{
					count++;
					ch[j]=' ';
				}
			}
			if(count>maxCount)
			{
			maxCount=count;
			maxChar=ch[i];
			}
		}
		System.out.println("The character that appears the most is: " + maxChar + " ---> " + maxCount);
		
	}
	
	public static void main(String[] args) {
		String str="Hello";
		mostFrequentCharacter(str);
	}

}
