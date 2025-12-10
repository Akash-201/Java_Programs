package Alphabet;

public class JPattern 
{
	public static void printJ_Pattern(int r,int c)
	{
		int middleColumn=(c/2)+1;
		int middleRow=(r/2)+1;
		
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1)
				{
					System.out.print("*");
				}
				else if(j==middleColumn)
				{
					System.out.print("*");
				}
				else if(i==r && j<=middleColumn)
				{
					System.out.print("*");
				}
				else if(j==1 && i>=middleRow)
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
		printJ_Pattern(7,7);

	}

}
