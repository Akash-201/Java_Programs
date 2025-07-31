package Character_Pattern;

/*
E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A 
*/

public class Pattern3
{
	public static void printPattern(char ch1, char ch2)
	{
		for(char i=ch2;i>=ch1;i--)
		{
			for(char j=ch2;j>=ch1;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		char ch1='A';
		char ch2='E';
		printPattern(ch1, ch2);
	}

}
