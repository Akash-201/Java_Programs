package Alphabet;

public class XPattern 
{
	public static void printX_Pattern(int r, int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else if(i+j==c+1)
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
		printX_Pattern(7,7);
		
	}
}
