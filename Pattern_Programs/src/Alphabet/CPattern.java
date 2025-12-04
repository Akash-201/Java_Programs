package Alphabet;

public class CPattern 
{
	public static void printC_Pattern(int r,int c)
	{
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
		printC_Pattern(6,5);

	}

}
