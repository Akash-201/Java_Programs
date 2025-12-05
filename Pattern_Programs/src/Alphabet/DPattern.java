package Alphabet;

public class DPattern 
{
	public static void printD_Pattern(int r,int c)
	{
		int middle=(c/2)+1;
		for (int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1 && j!=c)
				{
					System.out.print("*");
				}
				else if(i==r && j!=c)
				{
					System.out.print("*");
				}
				else if(j==c && i!=1 && i!=r)
				{
					System.out.print("*");
				}
				else if(j==middle)
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
		printD_Pattern(6,7);
	}

}
