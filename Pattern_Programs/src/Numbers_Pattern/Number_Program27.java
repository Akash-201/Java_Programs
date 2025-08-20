package Numbers_Pattern;
/*
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1 
 */

public class Number_Program27
{
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		printPattern(n);
	}

}
