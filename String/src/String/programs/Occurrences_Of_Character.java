package String.programs;

public class Occurrences_Of_Character
{
	public static void count(String str)
	{
		char[] ch=str.toCharArray();

		for(int i=0;i<ch.length;i++)
		{

			if(ch[i]==' ')

				continue;

			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{

					c++;
					ch[j]=' ';
				}


			}

			System.out.println(ch[i]+" ---> "+c);

		}
	}
	public static void main(String[] args) {
		count("HELLO");
	}

}
