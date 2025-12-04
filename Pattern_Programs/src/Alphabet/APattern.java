package Alphabet;

public class APattern 
{
	public static void printA_Pattern(int r,int c)
	{
		int middle=(r/2)+1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				// Top Bar (excluding corners)
				if(i==1 && j>1 && j<c)
				{
					System.out.print("*");
				}
				// Center Bar
				else if(i==middle)
				{
					System.out.print("*");
				}
				// Vertical Sides (excluding the first row)
				else if((j==1 || j==c) && i!=1)
				{
					System.out.print("*");
				}
				// Everything Else (the empty space)
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		printA_Pattern(6,6);
	}

}
