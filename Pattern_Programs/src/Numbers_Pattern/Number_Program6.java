package Numbers_Pattern;

/*  1
    2 6
    3 7 10
    4 8 11 13
    5 9 12 14 15

difference between 1st and 2nd coloumn is 4, 2nd and 3rd is 3 ,so on 2,1 
*/

import java.util.Scanner;

public class Number_Program6
{
	public static void print(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int num=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num+n-j;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the value of n: ");	
			int n=sc.nextInt();
			print(n);
		}

	}
	
}
