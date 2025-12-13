package Alphabet;

public class NPattern 
{
	public static void printN_Pattern(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j==1 || j==c)
				{
					System.out.print("*");
				}
				else if(i==j)
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
		printN_Pattern(7,7);
		
	}

}
