package Numbers_Pattern;
/*
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
0 1 0 1 0 
 */

public class Number_Program18
{
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
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
