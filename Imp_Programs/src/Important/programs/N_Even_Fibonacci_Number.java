package Important.programs;

import java.util.Scanner;

public class N_Even_Fibonacci_Number 
{
  public static void print(int n)
  {
	  int count=0;
	  int a=1;
	  int b=1;
	  for(int i=1;;i++)
	  {
		  if(a%2==0)
		  {
			  System.out.print(a+" ");
			  count++;
		  }
		  if(count==n)
		  {
			  break;
		  }
		  int c=a+b;
		  a=b;
		  b=c;
	  }
	  System.out.println();
	  
  }


	public static void main(String[] args) 
	{
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			print(n);
		}

	}
}
