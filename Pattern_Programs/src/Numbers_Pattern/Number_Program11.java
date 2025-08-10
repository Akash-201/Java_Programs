package Numbers_Pattern;

public class Number_Program11 
{
	public static void printPattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		printPattern(n);
	}

}
