package CompanyQuestions;



public class StringTransformer
{
	public static void print(String str)
	{
		char[] ch=str.toCharArray();
		String str2="";
		
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				str2=str2+ch[i];
			}
			if(count>1)
			{
				str2+=count;
			}
		}
		System.out.println(str2);
	}
	public static void main(String[] args) 
	{
		String str="tomorrow";
		print(str);
		
	}

}
