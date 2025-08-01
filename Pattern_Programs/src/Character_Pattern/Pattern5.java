package Character_Pattern;

/*
A B C D E 
F G H I J 
K L M N O 
P Q R S T 
U V W X Y 
*/

public class Pattern5
{
	public static void printPattern(int n, char ch)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch+" ");
				if(ch<'Z')
				{
					ch++;
				}
				else
				{
					ch='A';
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		char ch='A';
		printPattern(n, ch);
	}

}
