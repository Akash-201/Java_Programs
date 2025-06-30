package String.programs;


/*  input: aabbbcccc
   output: c
   because 'c' appears 4 times, which is more than 'a' (2 times) or 'b' (3 times). */

public class Maximum_Occurring_Character 
{
	
	public static void check(String str)
	{
		char[] ch=str.toCharArray();
		
		int maxCount=0;
		
		char maxChar=' ';
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]== ' ')
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
	public static void main(String[] args) 
	{
		String str="aabbbcccc";
		check(str);
		
	}
	

}
