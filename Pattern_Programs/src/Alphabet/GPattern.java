package Alphabet;

public class GPattern
{
	public static void printG_Pattern(int r,int c)
	{
		int middle=(r/2)+1;

		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1)
				{
					System.out.print("*");
				}
				else if(i==r)
				{
					System.out.print("*");
				}
				else if(j==c && i>=middle)
				{
					System.out.print("*");
				}
				else if(j==1)
				{
					System.out.print("*");
				}
				else if(i==middle && j>=(c/2)+1)
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
		printG_Pattern(7,7);

	}

}
