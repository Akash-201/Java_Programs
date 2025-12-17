package Alphabet;

public class TPattern 
{
	public static void printT_Pattern(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1)
				{
					System.out.print("*");
				}
				else if(j==c/2+1)
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
		printT_Pattern(5,7);
		
	}

}
