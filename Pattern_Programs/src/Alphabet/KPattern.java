package Alphabet;

public class KPattern 
{
	public static void printK_Pattern(int r,int c)
	{
		int middle=(r/2)+1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j==1  || i+j==middle+1 || i-j==middle-1)
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
		printK_Pattern(7,4);

	}

}
