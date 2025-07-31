package Character_Pattern;
/*
A B C D E 
A B C D E 
A B C D E 
A B C D E 
A B C D E 
*/


public class Pattern2
{
	public static void printPattern(char ch1, char ch2)
	{
		for(char i=ch1;i<=ch2;i++)
		{
			for(char j=ch1;j<=ch2;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		char ch1='A';
		char ch2='E';
		printPattern(ch1, ch2);
	}

}
