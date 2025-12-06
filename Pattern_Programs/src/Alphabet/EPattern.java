package Alphabet;

public class EPattern 
{
	public static void printE_Pattern(int r,int c)
	{
		int middle=(r/2)+1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1 && j>1)
				{
					System.out.print("*");
				}
				else if(i==r && j>1)
				{
					System.out.print("*");
				}
				else if(i== middle)
				{
					System.out.print("*");
				}
				else if(j==1 && i!=1 && i!=r)
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
		printE_Pattern(7,7);
		
	}

}
