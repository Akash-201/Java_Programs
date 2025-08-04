package Character_Pattern;

public class pattern8 
{
	public static void printPattern(int n)
	{
		int x;
		for(int i=1;i<=n;i++)
		{
			x=n-i;
			for(int j=1;j<=n;j++)
			{
			
				System.out.print((char)(x+65)+" ");
				x=x+n;
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int n=5;
		printPattern(n);
	}

}
