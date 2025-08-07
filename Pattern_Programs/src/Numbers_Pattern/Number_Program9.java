package Numbers_Pattern;

public class Number_Program9 
{
	public static void printPattern(int n, int m)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(j+" "+i+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int n=5;
		int m=3;
		printPattern(n, m);
	}

}
