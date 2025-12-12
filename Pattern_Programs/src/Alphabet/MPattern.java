package Alphabet;

public class MPattern 
{
	public static void printM_Pattern(int r,int c)
	{
		int middle=(r/2)+1;
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j==1 || j==c)
				{
					System.out.print("*");
				}
				else if((i==j || i+j==c+1) && i<=middle)
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
		printM_Pattern(7,7);
	}

}
