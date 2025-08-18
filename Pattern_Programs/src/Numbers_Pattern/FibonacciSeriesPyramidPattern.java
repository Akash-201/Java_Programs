package Numbers_Pattern;
/*
0 
0 1 
0 1 1 
0 1 1 2 
0 1 1 2 3 

 */

public class FibonacciSeriesPyramidPattern
{
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int a=0;
			int b=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		printPattern(n);
	}

}
