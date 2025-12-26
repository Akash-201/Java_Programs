package Alphabet;

public class YPattern 
{
	public static void printY_Pattern(int r,int c)
	{
		int middle=r/2+1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==j && i<=middle)
				{
					System.out.print("*");
				}
				else if(j==c-i+1 && i<=middle)
				{
					System.out.print("*");
				}
				else if(j==c/2+1 && i>=middle)
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
		printY_Pattern(7,7);
	}
}
