package Star_pattern;

//    *
//   *
//  *
// *


import java.util.Scanner;

public class Star_Pattern12 
{

	 public static void print(int n)
	 {
		 for(int i=1;i<=n;i++)
		 {
			  for(int j=n;j>=i;j--)
	            {
	                System.out.print(" ");
	            }
	            System.out.print("*");
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
