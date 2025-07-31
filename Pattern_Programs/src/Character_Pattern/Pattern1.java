package Character_Pattern;
/*
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 
*/

public class Pattern1 
{
	public static void printPattern(char ch1, char ch2)
	{
		for(char i=ch1;i<=ch2;i++)
		{
			for(char j=ch1;j<=ch2;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		char ch1='A';
		char ch2='E';
		printPattern(ch1, ch2);
	}

}
