package InterviewerAsked;

// Print Fibonacci Series without third variable

public class FibonacciSeriesWithoutThirdVariable 
{
	public static void printFibonacciSeries(int n)
	{
		int a=0,b=1;
		for(int i=0;i<n;i++)
		{
			System.out.print(a+" ");
			a=a+b;
			b=a-b;
		}
	}
	public static void main(String[] args) {
		printFibonacciSeries(10);
	}

}
