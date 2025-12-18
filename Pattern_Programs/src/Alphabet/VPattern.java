package Alphabet;

public class VPattern
{
	public static void printV_Pattern(int r,int c)
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
		printV_Pattern(7,7);
	}
}
