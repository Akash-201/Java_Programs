package Alphabet;

public class LPattern
{
	public static void printL_Patteren(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j==1)
				{
					System.out.print("*");
				}
				else if(i==r)
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
		printL_Patteren(6,5);
		
	}

}
