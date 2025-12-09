package Alphabet;

public class IPattern 
{
	public static void printI_Pattern(int r,int c)
	{
		int middle=(c/2)+1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1)
				{
					System.out.print("*");
				}
				else if(i==r)
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
	public static void main(String[] args) 
	{
		printI_Pattern(6,7);
		
	}

}
