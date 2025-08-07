package Numbers_Pattern;
/*
1 1 1 2 1 3 
2 1 2 2 2 3 
3 1 3 2 3 3 
4 1 4 2 4 3 
5 1 5 2 5 3 
*/

public class Number_Program10 
{
	public static void printPattern(int n,int m)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		int m=3;
		printPattern(n, m);
	}

}
