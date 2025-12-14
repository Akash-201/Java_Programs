package Alphabet;

public class OPattern 
{
	public static void printO_Pattern(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if((i==1 || i==r) && j!=1 && j!=c)
				{
					System.out.print("*");
				}
				else if((j==1 || j==c) && i!=1 && i!=r)
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
	public static void main(String[] args) {
		printO_Pattern(7,6);
	}

}
