package String.programs;

public class First_Non_Repeating_Character
{
	public static void print(String str)
	{
		char[] ch=str.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && i!=j)
				{
					count++;				
				}
			}
			if(count==1)
			{
				System.out.println("In "+str+", First Non-Repeating Character Is: "+ch[i]);
				break;
			}
		}
	}
	public static void main(String[] args) {
		String str="swiss";
		print(str);
	}

}
