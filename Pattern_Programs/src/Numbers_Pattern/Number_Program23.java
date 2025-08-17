package Numbers_Pattern;

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
