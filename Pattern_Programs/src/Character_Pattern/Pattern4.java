package Character_Pattern;

/*
E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A 
*/

public class Pattern4 
{
	public static void printPattern(char ch1,char ch2)
	{
		for(char i=ch2;i>=ch1;i--)
		{
			for(char j=ch2;j>=ch1;j--)
			{
				System.out.print(j+" ");
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
