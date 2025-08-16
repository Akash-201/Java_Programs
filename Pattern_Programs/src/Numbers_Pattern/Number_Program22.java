package Numbers_Pattern;
/*
1 
2 4 
3 6 9 
4 8 12 16 
5 10 15 20 25 
*/

public class Number_Program22 
{
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i*j+" ");
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
