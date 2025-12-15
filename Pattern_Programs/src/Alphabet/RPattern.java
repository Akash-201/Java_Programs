package Alphabet;

public class RPattern 
{
	public static void printR_Pattern(int r,int c)
	{
		int middle=r/2+1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j==1 || i==1 || (j==c && i<middle))
				{
					System.out.print("*");
				}
				else if(i==middle)
				{
					System.out.print("*");
				}
				else if(i>=middle && j==(i-middle+2))
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
		printR_Pattern(9,7);
		
	}

}
