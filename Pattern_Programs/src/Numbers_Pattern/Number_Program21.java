package Numbers_Pattern;

/*
1 
3 5 
5 7 9 
7 9 11 13 
9 11 13 15 17 
 */

public class Number_Program21 
{
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int k=i-1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+i+" ");
				k+=2;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		printPattern(n);
	}

}
