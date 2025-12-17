package Alphabet;

public class UPattern 
{
	public static void printU_Pattern(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if((j==1 || j==c) && i!=r )
				{
					System.out.print("*");
				}
				else if(i==r && j!=1 && j!=c)
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
		printU_Pattern(7,7);
	}

}
