package Numbers_Pattern;

public class Number_Program13 
{
	public static void printPattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n=5;
		printPattern(n);
	}

}
