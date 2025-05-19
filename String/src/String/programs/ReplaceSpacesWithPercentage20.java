package String.programs;



public class ReplaceSpacesWithPercentage20 
{
	public static void replaceSpace(String str)
	{
		String result="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				result=result+"%20";
			}
			else
			{
				result=result+str.charAt(i);
			}
		}
		System.out.println(result);
		
	}
	
	public static void main(String[] args)
	{
		String str="Mr John Smith";
		replaceSpace(str);
	}
	
	

}
