package String;



public class RemoveVowels
{
	public static void removeVowels(String str)
	{
		StringBuffer result=new StringBuffer();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i'
				|| ch=='I' || ch=='o' || ch=='O' || ch=='u' ||ch=='U')
			{
				
				continue;
			}
			else
			{
				result.append(ch);
			}
		}
		System.out.println(result);
		
	}
	public static void main(String[] args)
	{
		String str="Hello World!";
		removeVowels(str);
	}

}
