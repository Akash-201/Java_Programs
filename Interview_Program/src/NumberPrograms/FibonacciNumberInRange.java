package NumberPrograms;

public class FibonacciNumberInRange 
{
	public static void fibonacciNumberInRange(int n)
	{
		int a=0;
		int b=1;
		
		for(int i=0;a<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args)
	{
		fibonacciNumberInRange(100);
		
	}

}
