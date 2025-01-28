package Star_pattern;

//*********
//*       *
//*       *
//*********

import java.util.Scanner;

public class Star_Pattern14
{
	public static void print(int r,int c)
	{
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(i>=2 && i<=r-1 && j>=2 && j<=c-1)
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print("*");
					
				}
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args)
	{
		while(true) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Enter the value of r: ");
			int r = sc.nextInt();
			System.out.print("Enter the value of c: ");
			int c = sc.nextInt();


			print(r,c);

		}
	}

}
