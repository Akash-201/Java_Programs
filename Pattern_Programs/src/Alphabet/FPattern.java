package Alphabet;

public class FPattern 
{
	public static void printF_Pattern(int r,int c)
	{
		int middle=(r/2)+1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i==1)
				{
					System.out.print("*");
				}
				else if(i==middle)
				{
					System.out.print("*");
				}
				else if(j==1 )
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
		printF_Pattern(7,6);
		
	}

}
