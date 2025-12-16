package Alphabet;

public class SPattern 
{
	public static void printS_Pattern(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1 || i==r/2+1 || i==r)
				{
					System.out.print("*");
				}
				else if((j==1 && i<=r/2+1) || (j==c && i>=r/2+1))
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
		printS_Pattern(9,7);
	}

}
