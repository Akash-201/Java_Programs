package Alphabet;

public class QPattern 
{
	public static void printQ_Pattern(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if((i==1 || i==r-1) && j!=1 && j<c-1)
				{
					System.out.print("*");
				}
				else if((j==1 || j==c-1) && i!=1 && i<r-1)
				{
					System.out.print("*");
				}
				else if(i==r && j==c )
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
		printQ_Pattern(8,7);
		
	}

}
