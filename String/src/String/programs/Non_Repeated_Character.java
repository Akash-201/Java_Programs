package String.programs;

public class Non_Repeated_Character
{
	public static void check(String str)
	{
		String convert=str.toLowerCase();
		char[] ch=convert.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=0;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && i!=j)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(ch[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		check("Hello");
	}

}
