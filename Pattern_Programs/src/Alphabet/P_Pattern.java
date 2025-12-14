package Alphabet;

import com.sun.tools.javac.Main;

public class P_Pattern
{
	public static void printP_Pattern(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j==1 && i!=1)
				{
					System.out.print("*");
				}
				else if((i==1 || i==r/2+1) && j!=1 && j!=c)
				{
					System.out.print("*");
				}
				else if(j==c && i<r/2+1 && i!=1)
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
		printP_Pattern(7,6);

	}


}
