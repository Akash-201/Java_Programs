package Alphabet;

public class BPattern 
{
	public static void printB_Pattern(int r,int c)
	{
		int middle=(r/2)+1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				// Top
				if(i==1 && j<c)
				{
					System.out.print("*");
				}
				// Middle
				else if(i==middle && j<c)
				{
					System.out.print("*");
				}
				// Side
				else if ((j==1 || j==c)&& i!=1 && i!=middle && i!=r)
				{
					System.out.print("*");
				}
				// Bottom
				else if(i==r && j!=c)
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
		printB_Pattern(7,6);
	}

}
