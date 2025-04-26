package InterviewerAsked;

public class FirstCharacterCapital
{
	public static void convert(String s1)
	{
		String[] s2=s1.split(" ");
		String afterConversion="";
		for(int i=0;i<s2.length;i++)
		{
			String word=s2[i];
			if(word.length()>0)
			{
				afterConversion+=word.toUpperCase().substring(0,1)+word.toLowerCase().substring(1)+" ";
			}
		}
		System.out.println("original string: "+s1);
		System.out.println("After convertion: "+afterConversion.trim());
		
	}
	public static void main(String[] args)
	{
		String s1="this is java";
		convert(s1);
	}
	
	

}
