package Star_pattern;

//****
//*  *
//*  *
//****

import java.util.Scanner;

public class Star_Pattern13
{
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(i>=2 && i<=n-1 && j>=2 && j<=n-1)
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

			System.out.print("Enter the value of n: ");
			int n = sc.nextInt();

			print(n);

		}
	}

}
