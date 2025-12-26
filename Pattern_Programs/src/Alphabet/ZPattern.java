package Alphabet;

public class ZPattern 
{
	public static void printZ_Pattern(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1 || i==r)
				{
					System.out.print("*");
				}
				else if(j==c-i+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	public static void main(String[] args)
	{
		printZ_Pattern(7,7);
	}

}
