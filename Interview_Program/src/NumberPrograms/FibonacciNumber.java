package NumberPrograms;

public class FibonacciNumber
{
	public static void fibonacciNumber(int n)
	{
		int a=0;
		int b=1;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args)
	{
		fibonacciNumber(10);
	}

}
