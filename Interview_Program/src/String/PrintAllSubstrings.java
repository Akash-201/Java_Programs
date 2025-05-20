package String;


public class PrintAllSubstrings
{
	public static void printAllSubstrings(String str)
	{
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			String str1="";
			for(int j=i;j<ch.length;j++)
			{
				str1=str1+ch[j];
				System.out.print(str1+" ");

			}
				
		}
				
	}
	public static void main(String[] args) {
		String str="abc";
		printAllSubstrings(str);
	}

}
