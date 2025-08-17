package Numbers_Pattern;

/*
1 
1 2 
2 3 4 
4 5 6 7 
7 8 9 10 11 
 */

public class Number_Program23 
{
	public static void printPattern(int n)
	{
		int x=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(x-i+" ");
				x++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		printPattern(n);
	}

}
